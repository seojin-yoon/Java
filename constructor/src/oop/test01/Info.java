package oop.test01;

public class Info {
	//이름, 나이
	private String name; //외부에서 접근 불가 (단, 현재 Info 클래스에서만 접근 가능)
	private int age;
	
	//this
	//: 자기 자신을 호출한 객체의 정보를 가지는 참조형 변수
	//: 메소드가 호출될 때 자동으로 만들어진다.
	//: 메소드 외부에서는 사용 불가능 **
	//: 클래스의 멤버를 호출할 때 this
	
	//- 형식
	//		클래스명 this;
	//		this.클래스멤버;
	
	//멤버메소드(setData,disp)
	
	//멤버변수는 main에서 불러올수 있도록 해야된다.=>public으로 지정함
	//this를 사용하는 이유=멤버변수와 멤버메소드를 클래스에서 불러오기 위해서
	public void setData(String name, int age) {
		this.name = name; // name = name; => 이러면 매개변수를 매개변수에 넣는 일이 발생함
		this.setAge(age);
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age < 1) { //예외처리
			System.out.println("나이를 잘못 입력하셨습니다!");
			this.age = 1;
			return; //리턴을 만나면 메소드를 종료시킴(약간 반복문에서의 break의 역할?)
		}
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name; //매개변수가 없기 때문에 name이라고 써줘도 됨.
	}
	
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("이름: "+ this.name);
		System.out.println("나이: "+ age);
	}
	
}
