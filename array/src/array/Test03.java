package array;

public class Test03 {

	public static void main(String[] args) {
//		주사위를 10번 던진 결과를 저장하려고 한다
//		배열을 이용하여 저장을 구현하시고 아래의 결과를 출력해라
//		[1] 전체 주사위 기록을 출력
//		[2] 짝수 주사위 기록을 출력
//		[3] 주사위 값들의 합계 출력
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = 1+(int)(Math.random()*6);
			if (i==9) {
				System.out.println(arr[i]);
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(i+1+"번째:"+arr[i]);
			}
		}

		int sum = 0;
		for(int i=0;i<5;i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
