package com.jsp.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.dto.Product;


public class ProductDao {
	
	
	EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("ahmed");
   	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public void save(Product product)
	{

		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		System.out.println("Product Saved");
	}
	
	public void updateByID(int id)
	{
		
		Product product = entityManager.find(Product.class, id);
		product.setName("osama");
		
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		
		System.out.println("Product Updated");
	}

	public void deleteProductByID(int id) {
		
		
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Product.class, id));
		entityTransaction.commit();
		
		System.out.println("Product Deleted");
		
	}

	public void getAllProduct() {
		
		String sql =  "select s from Product s";
		Query query = entityManager.createQuery(sql);
		
		List<Product> products = 	query.getResultList();
		
		for(Product p : products)
		{
			System.out.println(p.getId());
			System.out.println(p.getBrand());
			System.out.println(p.getName());
			
			
			System.out.println("==============");
		}
		
	}

	public void getProductById(int id) {
		// TODO Auto-generated method stub
		
		Product product =  entityManager.find(Product.class,id);
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getBrand());
		System.out.println(product.getPrice());



		
	}
}
