package poly04;

public class Dog extends Animal implements Eat,Bark{

	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println("¸Û¸Û");
	}
	public void eat() {
		System.out.println("»À´Ù±Í");
	}

}
