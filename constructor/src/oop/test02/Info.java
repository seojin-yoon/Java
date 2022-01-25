package oop.test02;

public class Info {
	//�������
	private String name;
	private int age;
	
	//������
	public Info() {
		System.out.println("����Ʈ ������ ȣ��");
		this.age = 1; //�⺻��
	}
	
	public Info(String name) {//�̸� ������
		System.out.println("�̸� ������ ȣ��");
		this.name = name;
		this.age = 1;
	}
	
	public Info(String name, int age) {
		System.out.println("�̸� ���� ������");
		this.name = name;
		this.setAge(age);
	}
	
	//setData, disp, setName, setAge, getter(return)
	
	
	public void setData(String name, int age) { //�̸��� ���� �ΰ��� ����. �⺻ �������
		this.name = name; //������ ���Կ�����
		this.setAge(age); //�޼ҵ�� ()�� ȣ��
	}
	
	public void disp() {
		System.out.println("�̸�: "+this.getName());
		System.out.println("����: "+this.getAge());
	}
	
	
	public void setName(String name) { //�̸��� ����. �̸��� �ٲ��� ��(����) �̸��� �����ϸ� ��. ����st
		this.name = name;
	}
	
	public void setAge(int age) { //���̸� ����. ���̰� �ٲ��� �� ���̸� �����ϸ� ��. ����st
		if (age<1) {
			System.out.println("���̸� �߸� �Է��ϼ̽��ϴ�!");
			this.age = 1;
			return;
		}
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
}
