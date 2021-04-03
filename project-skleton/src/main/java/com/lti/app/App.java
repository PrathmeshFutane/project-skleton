package com.lti.app;

import java.util.ArrayList;
import java.util.List;

import com.lti.dao.GenericDao;
import com.lti.entity.Category;
import com.lti.entity.Product;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		System.out.println("product added");
		
		
		
	}

}
