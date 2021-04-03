package com.lti.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.entity.Category;
import com.lti.entity.Product;
import com.lti.entity.Retailer;

public class ShoppingTest {

	@Test
	public void productCategoryTest() {
		GenericDao gdao = new GenericDao();
		Category cate = new Category();
		cate.setName("clothes");

		Product prod = new Product();
		prod.setImage("clothes_image");
		prod.setPrice(12345);
		prod.setProductDetail("this is tshirt");
		prod.setProductName("tshirt");
		prod.setQuantity(10);
		prod.setCategory(cate);
		
		List<Product> list = new ArrayList<Product>();
		list.add(prod);
		
		cate.setProduct(list);
		
		
		gdao.save(cate);
	}
	
	
	@Test
	public void productCategoryRetailerTest() {
		GenericDao gdao = new GenericDao();
		
		Retailer retailer = new Retailer();
		retailer.setEmail("shreyash@gmail.com");
		retailer.setMobileNumber(651651851);
		retailer.setName("shreyash");
		retailer.setPassword("shreyash123");
		retailer.setRevenue(500);
		
		
		Product prod = new Product();
		prod.setImage("watch_image");
		prod.setPrice(12345);
		prod.setProductDetail("this is watch");
		prod.setProductName("watch");
		prod.setQuantity(50);
		prod.setRetailer(retailer);
		
		Category cate = (Category) gdao.fetch(Category.class, 128);
		prod.setCategory(cate);
		
		List<Product> list = new ArrayList<Product>();
		list.add(prod);
		
		retailer.setProduct(list);
		gdao.save(retailer);
		
		
	}

}
