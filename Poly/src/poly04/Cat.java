package poly04;
//extends - Ŭ���� ��� Ű����.. Ŭ������ �߻�Ŭ���� ��Ʋ�� �� �ϳ��� ��ӹ��� �� �ִ�.

//C++���� ���߻���� ���������� �����ߴ�..
//-�޼ҵ��� ��ħ
//-�θ��� ��ħ

//JAVA������ ���߻���� �������� �����Ͽ���.
//-�������̽��� ���Ͽ� �������� ��� ���� �� �ִ�.
//-implements -�������̽� ���� ��� Ű����.. �������̽��� ������ ��� ����..

public class Cat extends Animal implements Eat,Bark{

	public Cat(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println("�߿�");
	}
	public void eat() {
		System.out.println("����");
	}

}
