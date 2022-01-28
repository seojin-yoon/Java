package oop.test01;

public class Mobile {
	//Main.java: main()을 가지는 클래스
	//Mobile: 휴대전화 클래스
	//단순히 만드는 것에 그치지 말고, 안정성을 높이기 위해 다음과 같이 강제 구현
	//[1]이름은 한번 설정하면 절대로 변경할 수 없습니다.(접근지정자)
	//[2]가격은 아무리 싸게 설정해도 40만원 미만은 불가능합니다
	//	20만원으로 설정시 40만원으로 설정되도록
	//[3]통신사나 가격 등은 계속 변경 설정이 가능하도록
	
	private String name,tel;
	private int price;
	
	public Mobile(String name, String tel, int price) {
		this.setName(name); //setName 메소드 불러옴
		this.tel = tel; 
		this.setPrice(price);
		
	}
	
	//setter
	private void setName(String name) { //클래스 내에서는 사용가능, but 메인에서는 접근불가능
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setPrice(int price) {
		if (price < 40) {
			System.out.println("가격을 잘못 설정하셨습니다.");
			this.price = 40;
			return;
		}
		this.price = price;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getTel() { 
		return tel;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void disp() {
		System.out.println(name+"\t\t"+tel+"\t\t"+price);
	
	}
	
	public void compare(Mobile m) {
		if (this.price < m.price) { //m도 하나의 객체(매개변수로 받아온 객체임)
			System.out.println(m.getName());
			
		}
		else if(this.price > m.price) {
			System.out.println(this.getName());
		}
		else{
			System.out.println("같다");
		}
	}
	
}
