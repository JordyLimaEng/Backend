package com.jordy.backend;

import com.jordy.backend.domain.Category;
import com.jordy.backend.domain.Product;
import com.jordy.backend.repositories.CategoryRepository;
import com.jordy.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		categoryRepository.deleteAll();
//		productRepository.deleteAll();
//
//		Category cat1 = new Category(null, "Computers");
//		Category cat2 = new Category(null, "Office");
//
//		Product prod1 = new Product(null, "Computer", 200.00);
//		Product prod2 = new Product(null, "Printer", 250.00);
//		Product prod3 = new Product(null, "Mouse", 20.00);
//
//		cat1.getProducts().addAll(Arrays.asList(prod1, prod2, prod3));
//		cat2.getProducts().addAll(Arrays.asList(prod2));
//
//		prod1.getCategories().addAll(Arrays.asList(cat1));
//		prod2.getCategories().addAll(Arrays.asList(cat1, cat2));
//		prod3.getCategories().addAll(Arrays.asList(cat1));
//
//		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
//		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
	}
}
