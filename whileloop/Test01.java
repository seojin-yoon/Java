package whileloop;

public class Test01 {

	public static void main(String[] args) {
		int i=1;//초기식
		while(true) { //무한반복
			System.out.println("i = "+i);
			if(i==7) {
				break;//반복문 즉시 종료
			}
			i++; //i를 1씩 증가
			
		}
		
		i=1;
		while(i<=7) { //조건식
			System.out.println("i = "+i); //7까지 출력되고
			i++; //증감식이 없으면 무한반복함 //i가 8로 증가되고 끝
		}
		
	}

}
