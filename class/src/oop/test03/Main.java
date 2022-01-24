package oop.test03;

public class Main {

	public static void main(String[] args) {
		//이름, 나이, 국어성적, 영어성적, 수학성적, 총점, 평균
		
		//이름 홍길동
		//나이 20
		//국어성적 89
		//영어성적 77
		//수학성적 21
		//총점 187
		//평균 62...(실수)
		
		
		Info in = new Info();
		in.setData("홍길동", 20, 89, 77, 21);
		in.sum();
		in.divide();
		in.display();
	}

}
