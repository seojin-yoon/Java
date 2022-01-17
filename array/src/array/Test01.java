package array;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		//문제1) 10부터 50까지 배열에 저장
		//정답1) 10 20 30 40 50
		
		int a = 10;
		for(int i=0;i<arr.length;i++) {
			arr[i] = a;
			System.out.println(arr[i]);
			a+=10;
		}
		
		//문제2) 전체 합 출력
		//정답2) 150
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
