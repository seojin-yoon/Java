package poly02;

public class Animal {
	private String name;
	
	public Animal(String name) {//������ ����� ����Ʈ ������ ����ȵ�
		this.name = name;
	}
	
	public void disp() {
		System.out.println("�̸� : "+name);
		
	}
	
	public void bark() {
		System.out.println("??????????????");
	}
}
