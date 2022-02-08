package oop.inher03;

public class Main {

	public static void main(String[] args) {
		// (아래의 객체를 생성한 뒤 정보 출력)
		//name	 	telecom	price	card	month
		//아이폰7 	KT		90만원	국민카드	24개월
		//갤럭시7	 	SK		30만원	신한카드	30개월
		//G6		LG		35만원	삼성카드	36개월
		
		Mobile m1 = new MobileEx("아이폰7","KT",90,"국민",24);
		Mobile m2 = new MobileEx("갤럭시7","SK",30,"신한",30);
		Mobile m3 = new MobileEx("G6","LF",35,"삼성",36);
		System.out.println("name\ttelecom\tprice\tcard\tmonth");
		m1.disp();
		m2.disp();
		m3.disp();
	}

}
