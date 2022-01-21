package array;

public class Test01 {

	public static void main(String[] args) {
		/* 5*5 빙고판을 만드려고 한다
		 * 1부터 25까지의 숫자를 5X5 크기의 빙고판에 무작위로 배치하려고 한다.
		 * 모든 자리에 숫자가 랜덤으로 배치될 수 있도록 코드를 구현하시오.
		 *
		 *for 반복문 1개를 사용한다. 1개 1~25 (배열은 0으로 초기화되어있다는 걸 생각해라)
		 *랜덤인덱스 - 세로인덱스 1개 가로인덱스 1개
		 */
		
		int[][] bingo = new int[5][5];
		/*
		//2번 방법:인덱스 랜덤
				int[] arr2 = new int[6];
				for (int i=0;i<1000;i++) {
					int idx = (int)(Math.random()*6); //0 1 2 3 4 5
					arr2[idx]++; //나온 순서가 궁금하지 않으면 인덱스만 돌려도 됨.
					//1이 나온 횟수는 idx=0에 저장되기 때문에
				}
				for (int i=0;i<arr2.length;i++) {
					System.out.println(i+1+"이 나온 횟수 : "+ arr[i]);
				}
		*/
		int se=0;
		int ga=0;
		for (int i=1;i<26;i++) {
			se=(int)(Math.random()*5); //0 1 2 3 4
			ga=(int)(Math.random()*5);
			if (bingo[se][ga]==0) {
				bingo[se][ga]=i;
			}
			else {
				i--;//강제로 인덱스를 변경
				
			}
			
		}
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(bingo[i][j]+"\t");
			}
			System.out.println();
		}
		
//while문의 경우에 continue를 쓸 수 있는 이유:
//continue를 만나서 증감식이 실행이 안됨..
	}

}
