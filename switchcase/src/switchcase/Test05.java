package switchcase;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����,����,���� ������ �Է¹��� ��
		 * �����
		 * 100~90�̸� ���� A
		 * 80����� ���� B
		 * 70����� ���� C
		 * 60����� ���� D
		 * �׿� ��� ���� F
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		int total=score1+score2+score3;
		double avg=total/3.0; //��� ���� �� ������ double�� ���ض�
		
		System.out.println("��� "+avg);
		
		switch((int)avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}

}
