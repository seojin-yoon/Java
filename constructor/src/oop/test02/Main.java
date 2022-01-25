package oop.test02;

public class Main {

	public static void main(String[] args) {
		Info in = new Info();
		in.setData("홍길동", 20);
		in.disp();
		
		Info in2 = new Info("홍길동", 30);
		in2.disp();
		
		Info in3 = new Info("이몽룡"); //생성자는 new라는 객체 생성시 단 한번만 실행됨
		in3.disp();
		
		//Info in4 = new Info(30); //나이 생성자가 없어서 에러남
	}

}
