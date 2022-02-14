package api.lang.string;

public class Test03 {

	public static void main(String[] args) {
		String url = "https://www.naver.com";
		
		//문자열 편집
		//지정한 위치의 인덱스부터 끝까지 문자열을 잘라서 반환하는 메소드
		System.out.println(url.substring(7));
		//지정한 위치 인덱스부터 끝인덱스 미만까지
		System.out.println(url.substring(7,10));
	
		//.replace
		System.out.println(url.replace('/', '+'));
		
		
		url = "                 http://www.naver.com   ";
		//.trim - 공백제거
		System.out.println(url.trim()+ url.trim().length());
	}

}
