package oop.test01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info in = new Info(); //클래스명: Info 객체명: in 
		//Scanner sc = new Scanner(System.in);
		//sc: 객체명
		in.setData("홍길동", 20); //인자값: 매개변수로 들어가는 데이터 ex> 홍길동이 setData의 매개변수안으로 들어감
		in.disp();
		String name = in.getName(); //메소드에서 -> 메소드를 호출한 장소로 값을 보내준다.
		System.out.println(name);
		
		Info in2 = new Info();
		in2.setData("이몽룡", 35);
		in2.disp();
		in.disp();
	}

}




































