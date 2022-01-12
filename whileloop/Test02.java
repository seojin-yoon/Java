package whileloop;

public class Test02 {

	public static void main(String[] args) {
		
		//문제 1) 1~10까지 출력
		int i=1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		i=1;
		while (true) {
			System.out.println(i);
			if(i==10) {
				break;
			}
			i++;
		}
		
		//문제 2) 1~10까지 반복해 5~9출력 5,6,7,8,9
		int j=1;
		while (j<=10) {
			if (j>=5 && j<=9) {
				System.out.println(j);
			}
			j++;
		}
		
		j=1;
		while (true) {
			if(j>=5 && j<=9) {
				System.out.print(j+" ");
			}
			if(j==10) {//종료지점
				System.out.println();
				break;//break;를 한 이후에는 코드를 쓸 수 없다.
				//break밑에는 코드를 아무것도 적을 수 없음 왜냐면 종료되었기 때문에
			}
			j++;
		}
		
		//문제 3) 10~1까지 반복해 6,5,4,3으로 거꾸로 출력
		int k=10;
		while (k>=1) {
			if(k<=6 && k>=3) {
				System.out.println(k);
			}
			k--;
		}
		
		k=10;
		while (true) {
			if(k>=3&&k<=6) {
				System.out.print(k+" ");
			}
			
			if(k==1) {
				System.out.println();
				break;
			}
			k--;
		}
		//문제 4) 1~10까지 반복해 2,4,6,8,10으로 짝수만 출력
		int m=1;
		while (m<=10) {
			if (m%2==0) {
				System.out.println(m);
			}
			m++;
		}
		m=1;
		while(true) {
			if (m%2==0){
				System.out.print(m+" ");
			}
			if(m==10) {
				System.out.println();
				break;
			}
			m++;
		}
		
		
	}

}