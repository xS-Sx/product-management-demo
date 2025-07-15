package com.xss.demo;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;
// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.xss.demo.product.Product;

// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class PageController {

	// private final AtomicLong counter = new AtomicLong();

	List<Product> mockProducts = Arrays.asList(
				new Product(
						"1001", "saving-101", "saving account 101",
						19.8, 2, "101"),
				new Product(
						"1002", "saving-102", "saving account 102",
						19.8, 2, "102"));

	@GetMapping("/products")
	public String products(Model model, Principal principal) {
		
		model.addAttribute("products", mockProducts);
		
		Product editProduct = new Product("", "", "", 0.0, 0, principal.getName());
		model.addAttribute("editProduct", editProduct);
		return "products";
	}

	@PostMapping("/products")
	public String createProduct(@ModelAttribute Product editProduct){
		// productService.add(editProduct);
		
		return "redirect:/products";

	}

	@PutMapping("/products/{productId}")
	public String updateProduct(@ModelAttribute Product editProduct){
		// productService.update(editProduct);
		
		return "redirect:/products";

	}

	@DeleteMapping("/products/{productId}")
	public String deleteProduct(@ModelAttribute Product editProduct){
		// productService.delete(editProduct);
		
		return "redirect:/products";

	}

}