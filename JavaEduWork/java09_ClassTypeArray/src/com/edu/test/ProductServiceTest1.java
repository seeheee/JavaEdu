package com.edu.test;

import com.edu.service.ProductService;
import com.edu.vo.Product;

public class ProductServiceTest1 {

	public static void main(String[] args) {
		Product[] pros = {
				new Product("신라면", 2000, 5,"농심"),
				new Product("비타타원", 1500, 5,"농심"),
				new Product("쿠키", 2000000, 1,"농심"),
				new Product("과자", 2500, 4,"농심"),
		};
		
		ProductService service = new ProductService();
		
		String[] makers = service.getAllMaker(pros);
		for(String s : makers) System.out.println(s);
		
		service.getMorePrice(pros, 10000);
		for(Product p : pros) System.out.println(p.getPrice());

		service.getCompany(pros, "농심");
		for(Product p : pros) System.out.println(p.getCompany());
		
		
	}

}