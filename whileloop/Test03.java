package whileloop;

public class Test03 {

	public static void main(String[] args) {
		/*문제1) 1~5까지의 합 출력 =>15 (누적합 구하기)
		 *문제2) 1~10까지 반복해 3미만 7이상만 출력 =>1,2,7,8,9,10 
		 *문제3) 문제2의 조건에 맞는 수들의 합 출력=>37
		 *문제4) 문제2의 조건에 맞는 수들의 개수 출력=>6
		 */
		
		//1번
		int i=1;
		int Sum=0;
		while(i<=5) {
			Sum=Sum+i; //Sum+=i; 0+1 1+2 3+3 6+4 10+5
			i++;
		}
		
		System.out.println(Sum); //어차피 합만 출력하는거라서 반복문 밖에서 출력하도록 한다.
		
		//2번,3번,4번
		i=1;
		int sum=0;
		int cnt=0;
		while(i<=10) {
			if (i<3||i>=7) {
				System.out.println(i);
				sum+=i;
				cnt++; //cnt+=1; //cnt=cnt+1;
			}
			i++;
			
		}
		System.out.println(sum);
		System.out.println(cnt);
	}

}










