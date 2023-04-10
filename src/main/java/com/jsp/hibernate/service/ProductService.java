package com.jsp.hibernate.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.hibernate.dao.ProductDao;
import com.jsp.hibernate.dto.Product;

public class ProductService {
	
	public void save(Product product)
	{
		ProductDao saveproduct = new ProductDao();
		saveproduct.save(product);
//		return product1;
	}
	
	public void updateProductById(int id)
	{
	     ProductDao productdao = new ProductDao();
	     productdao.updateByID(id);
	}
	
	public void deleteProductById(int id)
	{
		ProductDao productdao = new ProductDao();
	     productdao.deleteProductByID(id);
	}
	
	public void getAllProduct() {
		ProductDao productdao = new ProductDao();
		productdao.getAllProduct();
	}
	
	
	public void getProductById(int id)
	{
		ProductDao productdao = new ProductDao();
		productdao.getProductById(id);
	}
}
