package switchcase;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1번 선택");
			//break; //break가 없으면 다음 case로 넘어가버림
		case 2:
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("잘못된 번호를 입력하셨습니다.");
		}
		
		
	}

}
