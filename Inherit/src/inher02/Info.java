package oop.inher02;

public class Info {
	//������� - ����,�̸�
	//������ - ����Ʈ������, �̸�������, �����̸�������
	//����޼ҵ� - setter, getter, disp
	private int age;
	private String name;
	
	public Info() {//����Ʈ ������
		System.out.println("�θ� ����Ʈ ������ ����!");
		
	}
	
	public Info(String name) {//�̸� ������
		this.name = name;
		System.out.println("�θ� �̸� ������ ����!");
		
	}
	
	public Info(String name,int age) {//�Ű����� ���� �߿�!
		
		this.name = name;
		this.setAge(age);
		System.out.println("�θ� �̸� ���� ������ ����!");
	
	}
	
	public void setAge(int age) {
		if (age<1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void disp() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}
