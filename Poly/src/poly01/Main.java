package poly01;

public class Main {

	public static void main(String[] args) {
		//타입일치형
		
		Dog d = new Dog("사모예드");
		
		d.disp();
		d.bark();
		d.eat();
		
		//타입불일치형 - 업 캐스팅 - 다형성
		//-업캐스팅:부모의 참조형 변수에 자식 인스턴스 공간을 담는 것
		
		Animal a = new Dog("사모예드"); //자식껄 new했지만 도장은 부모꺼임
										//겹치는것만 자식껄 사용하고, 자식의 고유한 것은 사용못함
		a.disp(); //부모의 고유한 메소드 사용 가능 O
		a.bark(); //자식에서 오버라이드된 메소드 - 자식메소드 호출 가능 (부모에 같은 이름과 모양의 메소드)
		//a.eat(); //자식의 고유한 메소드 사용 불가능 -정보가 없으므로..
		
		//-다운캐스팅: 없음
	}

}
