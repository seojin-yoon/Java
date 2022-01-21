package array;

public class Test02 {

	public static void main(String[] args) {
		// 배열명[세로인덱스][가로인덱스]
		int[][] arr = new int[3][3];
		
		//10 20 30
		//40 50 60
		//70 80 90
		
		//문제1) 전체 합 출력: 450
		//문제2) 4의 배수만 출력: 20 40 60 80
		//문제3) 4의 배수의 합 출력: 200
		//문제4) 4의 배수의 개수 출력: 4
		
		int cnt=10;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				arr[i][j] = cnt;
				cnt+=10;
			}
			//cnt+=10; 이건아니다
		}
		
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int sum=0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				sum+=arr[i][j];
			}
		}
		
		System.out.println(sum);
		
		int sum2=0;
		int cnt2=0;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (arr[i][j]%4==0) {
					System.out.print(arr[i][j]+" ");
					sum2+=arr[i][j];
					cnt2++;
				}
			}
		}
		System.out.println();
		System.out.println(sum2);
		System.out.println(cnt2);
	}

}
