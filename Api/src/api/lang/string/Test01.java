package api.lang.string;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ȸ������ �α��� ����
		
		//1.ȸ������
		//String���� ȸ������ - ���̵�, ��й�ȣ
		
		//2.�α���
		//ȸ�������� �Ƶ� ��й�ȣ�� ��ġ�ϸ��� �α��� ����!
		//��ġ���� ������ �α��� ����!
		
		//3.����
		//�ݺ��� ����
		
		String dbId = null;
		String dbPw = null;
		Scanner sc = new Scanner(System.in);
		
		String id_=null;
		String pw_=null;
		while (true) {
			System.out.println("1.ȸ������ 2.�α��� 3.����\n�Է�:");
			int num = sc.nextInt();
			if (num==1) {
			
			dbId = sc.next();
			dbPw = sc.next();
			}
			else if(num==2) {
				id_ = sc.next();
				pw_ = sc.next();
			if (dbId.equals(id_)&dbPw.equals(pw_)) {
				System.out.println("�α��� �Ϸ�");
			}
			else {
				System.out.println("�α��� ����");
			}
			}
			else {
				System.out.println("�����մϴ�");
				break;
			}
		}
		
		
	}

}
