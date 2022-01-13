package switchcase;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수 입력후 홀수인지 짝수인지 switch ~case문으로 나타내기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		switch(num%2){
		case 0:
			System.out.println("짝수를 입력하셨습니다");
			break;
		case 1:
			System.out.println("홀수를 입력하셨습니다");
			break;
		default:
			System.out.println("음수를 입력하셨습니다!!!!!!");
		}
		
	}

}
