package api.lang.string;

public class Test04 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// 문제1)나이 출력
		// 정답1)33세
		
		// 문제2)성별 출력
		// 정답2)여성

		String strAge = jumin.substring(0,2);
		int intAge = Integer.parseInt(strAge);
		
		int age = 2022-(intAge+1900)+1;
		System.out.println(age+"세");
		char key = jumin.charAt(7);
		
		if (key =='1' || key =='3') {
			System.out.println("남성");
		}
	}

}
