package oop.inner01;

public class Main {

	public static void main(String[] args) {
		// �͸���øŬ����****
		//-Ŭ������ ���������� ����ϱ� ���ؼ� �κ������� ������ �߰��ϰų� �������ϴ� ����
		//-��ü�� ��Ȳ�� ���� �ʰų� �����Ǹ� �ؾ��ϴ� ���
		//-��ü �ϳ����� ������ �ش�.. 1ȸ��***
		
		Key enter = new Key() {
			//�޼ҵ��� �������̵�
			//-�޼ҵ��� ������
			//-�޼ҵ��� ���´� �ݵ�� ��ġ�Ǿ���Ѵ�.
			public void push() {
				System.out.println("����!");
			}
		};
		enter.push();
		Key esc = new Key() {
			public void push() {
				exit();
				System.out.println("����!");
			}
			public void exit() {
				System.out.println("���α׷��� ����˴ϴ�");
				System.exit(0);
				//�ܼ��� ���α׷� ���� �޼ҵ�..
				//0:��������, 0�̾ƴѼ�:����������
			}
		};
		esc.push();
		//esc.exit(); -������
		//�������� ����: �͸���øŬ�������� �߰��� �޼ҵ�� �ܺο����� ��� �Ұ�
	}

}
