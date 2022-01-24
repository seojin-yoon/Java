package oop.test03;

public class Info {
	String name;
	int age, kor, eng, math, tot;
	double avg;
	
	void setData(String _name, int _age, int _kor, int _eng, int _math) { //매개변수는 메인에서 받아오는 거임
		name = _name;
		age = _age;
		kor = _kor;
		eng = _eng;
		math = _math;
	}
	
	void sum() {//값 저장은 void로 하면 된다.
		tot = kor+eng+math;
		
	}
	
	void divide() {
		avg = tot/3;
	}
	
	
	void display() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("국어성적:"+kor);
		System.out.println("영어성적:"+eng);
		System.out.println("수학성적:"+math);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
	}
}
