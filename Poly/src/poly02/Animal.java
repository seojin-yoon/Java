package poly02;

public class Animal {
	private String name;
	
	public Animal(String name) {//생성자 만들면 디폴트 생성자 실행안됨
		this.name = name;
	}
	
	public void disp() {
		System.out.println("이름 : "+name);
		
	}
	
	public void bark() {
		System.out.println("??????????????");
	}
}
