package array;

public class Test04 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 정수를 랜덤으로 5개 저장
		for(int i=0;i<arr.length;i++) {
			arr[i] = 1 + (int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		double avg = sum/5.0;
		System.out.println("총점 : "+sum+"점");
		System.out.println("평균 : "+avg+"점");		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격생 수 : "+cnt+"명");
	}

}
