package poly02;

public class Main {
	//Dog과 Cat클래스에 있는 eat이라는 메소드를 실행시킬 수 있는 메소드 작성.
	public static void eat(Dog d) {//eat은 부모에 있는 메소드가 아니기 때문에 다형성 이용 불가능
		d.eat();
	}
	
	public static void eat(Cat c) {
		c.eat();
	}
	
	//bark
	public static void bark(Animal a) { //bark는 부모에 오버라이드된 메소드이기 때문에 다형성 이용 가능
		a.bark();						//일괄 처리 가능
	}
	
	
	public static void main(String[] args) {
		Dog d = new Dog("말라뮤트");	//Animal a = new Dog("말라뮤트");
		Cat c = new Cat("샴고양이");
		Main.eat(d);
		eat(c);
		bark(d);
		bark(c);

	}

}
