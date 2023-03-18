package com.edu.test;

import com.edu.vo.Product;

public class ProductArrayAppTest1 {

	public static void main(String[] args) {
		Product[] pros = {
				new Product("신라면", 2000, 5,"농심"),
				new Product("비타타원", 1500, 5,"농심"),
				new Product("몽쉘", 10000000, 2,"농심"),
				new Product("쿠키", 2000000, 1,"농심"),
				new Product("과자", 2500, 4,"농심"),
		};
		
		System.out.println("==========1. 상품 정보를 출력합니다. ============");
		for(Product p : pros)System.out.println(p.getDetails());
		
		System.out.println("==========2. 상품 메이커를 출력합니다. ============");
		for(Product p : pros)System.out.println(p.getMaker());
		
		System.out.println("==========3. 10만원 이상의 고가제품를 출력합니다. ============");
		for(Product p : pros) {
			if(p.getPrice() >= 100000) {
				System.out.println(p.getMaker());
			}
		}
		
		System.out.println("==========4. 지금까지 구입한 총 cost를 출력합니다. ============");
		int total = 0;
		for(Product p : pros) {
			    total += p.getPrice() * p.getQuantity();
				
			}
		System.out.println(total);
	}
}


