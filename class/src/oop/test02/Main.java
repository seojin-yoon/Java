package oop.test02;

public class Main {

	public static void main(String[] args) {
		//이름: 홍길동
		//나이: 20
		//성적: 80
		
		//이름: 이몽룡
		//나이: 35
		//성적: 89
		
		//이름: 김나비
		//나이: 24
		//성적: 100
		
		Info in = new Info(); //객체1 //new Info();할때마다 새 객체가 생김
		in.setData("홍길동", 20, 80);
		in.display();
		System.out.println(in.getName());
		
		Info in2 = new Info(); //객체2
		in2.setData("이몽룡", 35, 89);
		in2.display();
		System.out.println(in2.getName());
		
		Info in3 = new Info(); //객체3
		in3.setData("김나비", 24, 100);
		in3.display();
		System.out.println(in3.getName());
		}

}
