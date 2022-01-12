package whileloop;

public class Test04 {

	public static void main(String[] args) {
		
		
		//전역변수:자바는 전역변수가 존재하지 않는다.
		
		//지역변수:어느 한 지역에서 우선적으로 사용되는 변수
		//그 지역이 실행할 때 공간이 생성되고 그 지역이 끝날 때 공간이 소멸된다.
		
		//1~10까지의 임의의 수를 구해서 합을 구한다.
		//합이 100이 넘을 때까지 반복횟수를 구하세요.
		
		int sum = 0;
		int cnt = 0;
		
		while(sum<100) {
			int num = 1+(int)(Math.random()*10);
			System.out.println(num);
			sum+=num;
			cnt++;
		}
		System.out.println(sum);
		System.out.println(cnt);
		
		
	}

}
