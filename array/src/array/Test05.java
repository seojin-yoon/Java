package array;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) throws InterruptedException {
//		����ڿ��� 5���� �׸��� �Է¹޾� �迭�� �����ϰ�
//		�������� 1������ ��÷�Ͽ� ȭ�鿡 ���
//
//		(��)	�׸� : ���
//			�׸� : ���
//			�׸� : ����
//			�׸� : ¥���
//			�׸� : ���뱹
//			��÷���Դϴ�....
//			��÷�� �׸��� ������ �Դϴ�
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("�׸� �Է� :");
			arr[i] = sc.next();
		}
		System.out.println("��÷���Դϴ�...");
		Thread.sleep(1000);
		int selected = (int)(Math.random() * arr.length);//0 1 2 3 4
		System.out.println(arr[selected]);
		
	}

}
