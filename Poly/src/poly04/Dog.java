package poly04;

public class Dog extends Animal implements Eat,Bark{

	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println("�۸�");
	}
	public void eat() {
		System.out.println("���ٱ�");
	}

}
