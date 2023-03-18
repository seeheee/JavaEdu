package com.edu.test;
import com.edu.service.LotteMartService;
import com.edu.vo.Customer;
import com.edu.vo.Product;

public class LotteMartServiceTest3 {
	public static void main(String[] args) {
		Product[ ] pros1 = {
				new Product("신라면", 2000, 5, "농심"),
				new Product("비타타원", 1500, 2, "롯데"),
				new Product("크런키", 4000, 1, "롯데"),
				new Product("공기방울 세탁기", 400000, 1, "대우"),
		};
		
		Product[ ] pros2 = {
				new Product("빠다코코넛", 1700, 20, "롯데"),
				new Product("Terra", 4000, 1, "칭따오"),				
				new Product("모카 믹스커피", 23000, 2, "롯데"),
				new Product("그램노트북", 1700000, 1, "엘지"),
				new Product("센서 이어폰", 34000, 1, "엘지"),
		};
		
		Customer [] customers = {
				new Customer(111, "문동은", "신사동"),
				new Customer(222, "이연진", "여의도"),
				new Customer(333, "마동석", "신사동")
		};
		
		//각각의 고객과 상품들을 Hasing...
		customers[0].buyProducts(pros1);
		customers[1].buyProducts(pros2);
		
		LotteMartService service = new LotteMartService();
		
		/////////////// 아래에는 서비스 클래스의 기능을 하나씩 호출..결과출력까지 ////////////////
		
		System.out.println("===== 1. 특정 고객이 구입한 상품정보입니다 =============");
		
		
		System.out.println("\n===== 2. 특정 고객이 구입한 상품들의 maker입니다 =============");
		System.out.println(service.getAllProductMaker(customers[0]));
		
		System.out.println("\n===== 3. 특정 고객을 검색한 결과입니다.=============");
		System.out.println(service.findCustomer(customers, 111));
		
		System.out.println("\n===== 4. 다음은 동일한 동네에 거주하는 고객명단 입니다.=============");
		System.out.println(service.findCustomer(customers, "신사동"));
		
		System.out.println("\n===== 5. LotteMart에서 구입한 물건중 최고가 상품입니다.=============");
		
		
		System.out.println("\n===== 6. 고객님께서 구입한 상품중 1만원 이상 상품목록입니다.=============");
	}
}










