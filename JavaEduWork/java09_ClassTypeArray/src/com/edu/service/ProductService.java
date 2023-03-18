package com.edu.service;

import com.edu.vo.Product;

//상품들을 관리하는 기능들로만 작성된 서비스 클래스
// DB연동될 시 DAO 클래스로 발전
// 모든 함수는 전부 return 하도록 작성

// Method overrloading
// 하는 일은 같지만 처리하는 데이터를 달리할떄 사용하는 기법
// 1. 메소드 이름은 같되 인자값은 반드시 달라야한다(데이터타입, 갯수)
// 2. 메소드의 리턴타입은 상관없다.

/*
 * level3
 */

public class ProductService {
	
	public String[] getAllMaker(Product[] pros) {
		String[ ] temp = new String[pros.length];
	    int idx = 0;
	    for(Product p : pros) {
	    	temp[idx] = p.getMaker();
	    	idx++;
	    }
	    return temp;
	}
	
	
	//  특정 가격 이상의 제품들을 가져옵니다.
	public Product[ ] getMorePrice(Product[ ] pros, int price) {
		Product[ ] temp = new Product[pros.length];
	    int idx = 0;
	    for(Product p : temp) {
	    	if(p == null) continue;
	    	if(p.getPrice()>=price)
	    		temp[idx++] = p;
	    	idx++;
	    }
	    return temp;
	}

	//  동일한 회사의 제품을 가져옵니다.
	public Product[ ] getCompany(Product[ ] pros, String company) {
	    Product[ ] temp = new Product[pros.length];
	    int idx = 0;
	    for(Product p : temp) {
	     	if(p == null) continue;
	    	if(p.getCompany().equals(company))
	    		temp[idx++] = p;
	    	idx++;
	    }
	    return temp;
	}

	// 구매한 제품들의 평균가를 받아옵니다.
	public int getAvgPrice(Product[ ] pros) {
	    int avg = 0;
	    
	    return avg;
	}
	
	
}
