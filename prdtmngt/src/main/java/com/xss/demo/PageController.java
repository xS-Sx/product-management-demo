package com.xss.demo;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;
// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.xss.demo.product.Product;
import com.xss.demo.product.ProductService;

// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class PageController {

	// private final AtomicLong counter = new AtomicLong();
	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public String products(Model model, Principal principal) {

		List<Product> allProducts = productService.getAllProducts();
		model.addAttribute("products", allProducts);
		
		Product editProduct = new Product("", "", 0.0, 0, principal.getName());
		model.addAttribute("editProduct", editProduct);
		return "products";
	}

	@PostMapping("/products")
	public String createProduct(@ModelAttribute Product editProduct){
		// productService.add(editProduct);
		productService.createProduct(editProduct);
		return "redirect:/products";

	}

	// @PutMapping("/products/{productId}")
	// public String updateProduct(@ModelAttribute Product editProduct){
	// 	// productService.update(editProduct);
		
	// 	return "redirect:/products";

	// }

	@GetMapping("/products/delete/{productId}")
	public String deleteProduct(@PathVariable("productId") Long productId){
		// productService.delete(productId);
		productService.deleteProduct(productId);;
		System.out.println(productId);
		return "redirect:/products";

	}

}