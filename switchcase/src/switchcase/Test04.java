package switchcase;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �Է��� Ȧ������ ¦������ switch ~case������ ��Ÿ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num=sc.nextInt();
		switch(num%2){
		case 0:
			System.out.println("¦���� �Է��ϼ̽��ϴ�");
			break;
		case 1:
			System.out.println("Ȧ���� �Է��ϼ̽��ϴ�");
			break;
		default:
			System.out.println("������ �Է��ϼ̽��ϴ�!!!!!!");
		}
		
	}

}
