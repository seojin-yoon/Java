package oop.test02;

public class Main {

	public static void main(String[] args) {
		//�̸�: ȫ�浿
		//����: 20
		//����: 80
		
		//�̸�: �̸���
		//����: 35
		//����: 89
		
		//�̸�: �質��
		//����: 24
		//����: 100
		
		Info in = new Info(); //��ü1 //new Info();�Ҷ����� �� ��ü�� ����
		in.setData("ȫ�浿", 20, 80);
		in.display();
		System.out.println(in.getName());
		
		Info in2 = new Info(); //��ü2
		in2.setData("�̸���", 35, 89);
		in2.display();
		System.out.println(in2.getName());
		
		Info in3 = new Info(); //��ü3
		in3.setData("�質��", 24, 100);
		in3.display();
		System.out.println(in3.getName());
		}

}
