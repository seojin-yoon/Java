package poly02;

public class Main {
	//Dog�� CatŬ������ �ִ� eat�̶�� �޼ҵ带 �����ų �� �ִ� �޼ҵ� �ۼ�.
	public static void eat(Dog d) {//eat�� �θ� �ִ� �޼ҵ尡 �ƴϱ� ������ ������ �̿� �Ұ���
		d.eat();
	}
	
	public static void eat(Cat c) {
		c.eat();
	}
	
	//bark
	public static void bark(Animal a) { //bark�� �θ� �������̵�� �޼ҵ��̱� ������ ������ �̿� ����
		a.bark();						//�ϰ� ó�� ����
	}
	
	
	public static void main(String[] args) {
		Dog d = new Dog("�����Ʈ");	//Animal a = new Dog("�����Ʈ");
		Cat c = new Cat("�������");
		Main.eat(d);
		eat(c);
		bark(d);
		bark(c);

	}

}
