package switchcase;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//Ű�� �Է¹���
		//Q or q :	SKILL1
		//W or w :  SKILL2
		//E or e :  SKILL3
		//R or r :  SKILL4
		
		System.out.println("Ű���带 �Է��ϼ���: ");
		Scanner sc=new Scanner(System.in);
		String user=sc.next(); //���ڿ��� �Է¹���
		
		switch (user) {
		case "Q":
			System.out.println("SKILL1");
			break;
		case "q":
			System.out.println("SKILL1");
			break;
		case "W":
			System.out.println("SKILL2");
			break;
		case "w":
			System.out.println("SKILL2");
			break;
		case "E":
			System.out.println("SKILL3");
			break;
		case "e":
			System.out.println("SKILL3");
			break;
		case "R":
			System.out.println("SKILL4");
			break;
		case "r":
			System.out.println("SKILL4");
			break;
		default:
			System.out.println("�߸��Է���!!");
		}
		
		/*char�� �Է¹޴� ���
		
		char key=sc.next().charAt(0); //char�� �Է¹޴� ���: ���� ù��° ���ڸ� �������� �޼ҵ� ���
		
		switch(Character.toLowerCase(key)){//�빮�ڸ� �ҹ��ڷ� �ٲپ��ִ� �޼ҵ�
		case 'q':
			System.out.println("SKILL1");
			break;
		case 'w':
			System.out.println("SKILL2");
			break;
		case 'e':
			System.out.println("SKILL3");
			break;
		case 'r':
			System.out.println("SKILL4");
			break;
		default:
			System.out.println("�߸��� �Է�!");
		
		}
		*/
		
		
		/*
		 * break ��ġ�� ���� �޶���
		String key1=sc.next();
		switch(key1) {
		case "Q":
		case "q":
			System.out.println("SKILL1");
			break;
		
		}
		*/
	}
}
