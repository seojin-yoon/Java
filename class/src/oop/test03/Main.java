package oop.test03;

public class Main {

	public static void main(String[] args) {
		//�̸�, ����, �����, �����, ���м���, ����, ���
		
		//�̸� ȫ�浿
		//���� 20
		//����� 89
		//����� 77
		//���м��� 21
		//���� 187
		//��� 62...(�Ǽ�)
		
		
		Info in = new Info();
		in.setData("ȫ�浿", 20, 89, 77, 21);
		in.sum();
		in.divide();
		in.display();
	}

}
