package api.lang.string;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 회원가입 로그인 문제
		
		//1.회원가입
		//String으로 회원가입 - 아이디, 비밀번호
		
		//2.로그인
		//회원가입한 아디 비밀번호랑 일치하면은 로그인 성공!
		//일치하지 않으면 로그인 실패!
		
		//3.종료
		//반복문 종료
		
		String dbId = null;
		String dbPw = null;
		Scanner sc = new Scanner(System.in);
		
		String id_=null;
		String pw_=null;
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료\n입력:");
			int num = sc.nextInt();
			if (num==1) {
			
			dbId = sc.next();
			dbPw = sc.next();
			}
			else if(num==2) {
				id_ = sc.next();
				pw_ = sc.next();
			if (dbId.equals(id_)&dbPw.equals(pw_)) {
				System.out.println("로그인 완료");
			}
			else {
				System.out.println("로그인 실패");
			}
			}
			else {
				System.out.println("종료합니다");
				break;
			}
		}
		
		
	}

}
