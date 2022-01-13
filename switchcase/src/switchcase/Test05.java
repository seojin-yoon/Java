package switchcase;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*국어,영어,수학 점수를 입력받은 후
		 * 평균이
		 * 100~90이면 학점 A
		 * 80점대면 학점 B
		 * 70점대면 학점 C
		 * 60점대면 학점 D
		 * 그외 모든 점수 F
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 입력: ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		int total=score1+score2+score3;
		double avg=total/3.0; //평균 구할 땐 무조건 double로 구해라
		
		System.out.println("평균 "+avg);
		
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
