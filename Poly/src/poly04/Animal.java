package poly04;

public abstract class Animal { //�߻�Ŭ����
	private String name;
	
	public Animal (String name) {
		this.name = name;
	}
	
	public void disp() {
		System.out.println("�̸� :"+name);
	}
	//public abstract void bark();
	//public abstract void eat();
}
