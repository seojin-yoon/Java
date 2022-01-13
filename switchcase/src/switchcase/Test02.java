package switchcase;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//키를 입력받음
		//Q or q :	SKILL1
		//W or w :  SKILL2
		//E or e :  SKILL3
		//R or r :  SKILL4
		
		System.out.println("키보드를 입력하세요: ");
		Scanner sc=new Scanner(System.in);
		String user=sc.next(); //문자열로 입력받음
		
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
			System.out.println("잘못입력함!!");
		}
		
		/*char로 입력받는 방법
		
		char key=sc.next().charAt(0); //char로 입력받는 방법: 가장 첫번째 문자를 가져오는 메소드 사용
		
		switch(Character.toLowerCase(key)){//대문자를 소문자로 바꾸어주는 메소드
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
			System.out.println("잘못된 입력!");
		
		}
		*/
		
		
		/*
		 * break 위치에 따라 달라짐
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
