package oop.test01;

public class Main {

	public static void main(String[] args) {
		//객체 생성후 아래의 내용을 구현
		// 		name	telecom 	price
		//[1]	갤럭시S8	SKT			30만원
		//[2]	G6		LG			33만원
		//[3]	아이폰7	KT			51만원
		//아이폰과 갤럭시 8의 가격을 비교하여 비싼 휴대폰 이름을 출력
		
		Mobile m3 = new Mobile("갤럭시S8","SKT",30);
		Mobile m1 = new Mobile("G6","LG",33);
		Mobile m2 = new Mobile("아이폰7","KT",51);

		System.out.println("name\t\ttel\t\tprice");
		m1.disp();
		m2.disp();
		m3.disp();
		
		//객체 배열
		Mobile[] arr = new Mobile[3]; //배열 공간 만들기
		arr[0] = new Mobile("갤럭시S8","SKT",30); //배열[0]인덱스에 객체 생성
		arr[1] = new Mobile("G6","LG",33);
		arr[2] = new Mobile("아이폰7","KT",51);
		
		
		for (int i=0;i<3;i++) {
			arr[i].disp();
		}
		
		
		//m1.setName("***") - private이기 때문에 main에서는 사용 불가능
		
		if (m1.getPrice() > m2.getPrice()) {
			if (m1.getPrice() > m3.getPrice()) {
				System.out.println(m1.getName()); 
			}
		}
		else {
			if (m2.getPrice() > m3.getPrice()) {
				System.out.println(m2.getName()); 
			}
			else {
				System.out.println(m3.getName()); 
			}
		}
		
		//가격 비교하는 메소드
		arr[0].compare(arr[2]); //매개변수로 넘어가는 데이터 : arr[2]있는 객체
								//this를 담당 : arr[0]있는 객체
		
	}

}
