package switchcase;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1�� ����");
			//break; //break�� ������ ���� case�� �Ѿ����
		case 2:
			System.out.println("2�� ����");
			break;
		case 3:
			System.out.println("3�� ����");
			break;
		default:
			System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
		}
		
		
	}

}
