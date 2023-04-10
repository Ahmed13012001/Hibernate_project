package com.jsp.hibernate.controller;

import com.jsp.hibernate.dto.Product;
import com.jsp.hibernate.service.ProductService;

public class ProductController {
	
	public static void main(String[] args) {
//		Product product1 = new Product();
//		product1.setName("Milk");
//		product1.setBrand("Amul");
//		product1.setPrice(30);
//		
//		ProductService saveProduct = new ProductService();
//		saveProduct.save(product1);
		
		ProductService productService = new ProductService();
//		productService.updateProductById(1);
//		productService.deleteProductById(1);
//		productService.getAllProduct();
		productService.getProductById(2);
		
		
		
		
		
		
		
		
		
	}
	
}
