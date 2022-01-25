package oop.test01;

public class Info {
	//�̸�, ����
	private String name; //�ܺο��� ���� �Ұ� (��, ���� Info Ŭ���������� ���� ����)
	private int age;
	
	//this
	//: �ڱ� �ڽ��� ȣ���� ��ü�� ������ ������ ������ ����
	//: �޼ҵ尡 ȣ��� �� �ڵ����� ���������.
	//: �޼ҵ� �ܺο����� ��� �Ұ��� **
	//: Ŭ������ ����� ȣ���� �� this
	
	//- ����
	//		Ŭ������ this;
	//		this.Ŭ�������;
	
	//����޼ҵ�(setData,disp)
	
	//��������� main���� �ҷ��ü� �ֵ��� �ؾߵȴ�.=>public���� ������
	//this�� ����ϴ� ����=��������� ����޼ҵ带 Ŭ�������� �ҷ����� ���ؼ�
	public void setData(String name, int age) {
		this.name = name; // name = name; => �̷��� �Ű������� �Ű������� �ִ� ���� �߻���
		this.setAge(age);
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age < 1) { //����ó��
			System.out.println("���̸� �߸� �Է��ϼ̽��ϴ�!");
			this.age = 1;
			return; //������ ������ �޼ҵ带 �����Ŵ(�ణ �ݺ��������� break�� ����?)
		}
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name; //�Ű������� ���� ������ name�̶�� ���൵ ��.
	}
	
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("�̸�: "+ this.name);
		System.out.println("����: "+ age);
	}
	
}
