package switchcase;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����� ��ǰ��÷ ���α׷�
		����ڿ��� ���డ�� ���� ���� ���ڷ� �Է¹޴´�(1~12)
		�ش��ϴ� ������ �´� ����ǰ�� �����Ѵٴ� �޼����� ����Ѵ�
		
		(ex)
		���� ���� ���� �� �Է�: 5
		���� ���డ�ø� Ȳ�縶��ũ�� ����ǰ���� �����մϴ�!
		�����÷��� ���⸦ ��������....
		
		[������ ����ǰ]
		��(3,4,5): Ȳ�縶��ũ
		����(6,7,8): �����ġ��
		����(9,10,11): ���۶�
		�ܿ�(12,1,2): ���÷�
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���డ�� ���� �� �Է�: ");
		int month=sc.nextInt();
		switch(month) {
		case 3:case 4:case 5:
			System.out.println("���� ���డ�ø� Ȳ�縶��ũ�� ����ǰ���� �����մϴ�!");
			break;
		case 6:case 7:case 8:
			System.out.println("������ ���డ�ø� �����ġ���� ����ǰ���� �����մϴ�!");
			break;
		case 9:case 10:case 11:
			System.out.println("������ ���డ�ø� ���۶󽺸� ����ǰ���� �����մϴ�!");
			break;
		case 12:case 1:case 2:
			System.out.println("�ܿ￡ ���డ�ø� ���÷��� ����ǰ���� �����մϴ�!");
			break;
		default:
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�!!");
		}
		
	}

}
