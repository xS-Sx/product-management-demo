package com.xss.prdtmngt;

import java.util.Arrays;
import java.util.List;
// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class PrdtmngtController {

	// private final AtomicLong counter = new AtomicLong();

	@GetMapping("/products")
	public String products(Model model) {
		List<Product> mockProducts = Arrays.asList(
				new Product(
						"1001", "saving-101", "saving account 101",
						19.8, 2, "101"),
				new Product(
						"1002", "saving-102", "saving account 102",
						19.8, 2, "102"));
		model.addAttribute("products", mockProducts);
		return "products";
	}
}