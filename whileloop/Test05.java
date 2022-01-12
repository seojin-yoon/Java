package whileloop;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		/*업다운 게임을 구현하려 한다.
		컴퓨터에게 1부터 100사이의 정답을 생성하도록 코드를 구현한 뒤
		사용자가 숫자를 입력하여 정답을 맞추도록 프로그래밍하세요
		
		<게임의 상태>
		[업]사용자가 정답보다 낮은 값을 입력한 경우
		[다운]사용자가 정답보다 높은 값을 입력한 경우
		[정답]사용자가 정답과 같은 값을 입력한 경우, 게임 종료
		
		게임종료시 총 입력한 횟수를 화면에 출력
		*/
		int cnt = 0;
		int answer = 1+(int)(Math.random()*30);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int user = sc.nextInt();
			cnt++;
			if (user==answer) {
				System.out.println("정답입니다!");
				System.out.println("총"+cnt+"번 입력하셨습니다.");
				break;
			}
			else if (user<answer) {
				System.out.println("업업");
			}
			else {
				System.out.println("다운다운");
			}
		}
		
		
		

	}

}
