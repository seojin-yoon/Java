package poly04;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog("�����Ʈ");
		Cat c = new Cat("�����");
		
		d.bark();
		d.eat();
		c.bark();
		c.eat();
		
		Bark b = new Bark() {

			@Override
			public void bark() {
				System.out.println("????"); 
				
			}
			
		};
		
		b.bark();

	}

}
