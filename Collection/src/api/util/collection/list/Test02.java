package api.util.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// [도서 등록 프로그램 구현]
		//사용자에게 계속해서 도서명을 입력받아 저장하는 저장소를 구현하려고 한다
		//이미 등록된 책이면 등록이 거절되었으면 한다
		//1.도서등록 2.도서삭제 3.도서검색
		
		List<String> list = new ArrayList<>();//다형성
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.도서등록 2.도서삭제 3.도서검색\n번호를 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine(); //enter값 제거(buffer 비우기)
			if (num==1) {
				System.out.println("도서를 등록하세요: ");
				
				String book = sc.nextLine();
				if(list.contains(book)) {
					System.out.println("이미 등록된 도서입니다.");
					
				}
				else if(book.equals("종료")) {
					System.out.println("프로그램을 종료한니다");
					break;
				}
				else {
					list.add(book);
					System.out.println("도서명 : "+book);
					System.out.println("도서 등록이 되었습니다... 현재도서 "+list.size()+"개");
			
				}
			}
			else if(num==2) {
				System.out.println("도서를 삭제하세요: ");
				String book = sc.nextLine();
				if(list.contains(book)) {
					list.remove(book);
					System.out.println("정상적으로 삭제되었습니다");
				}
				else {
					System.out.println("삭제하실 도서가 없습니다");
				}
				
			}
			
			else if(num == 3){
				System.out.println("검색하실 도서 입력: ");
				String book = sc.nextLine();
				if(list.contains(book)) {
					System.out.println(book+"도서는"+(list.indexOf(book)+1)+"번째에 있습니다");
				}
				else {
					System.out.println("찾으시는 도서가 없습니다");
				}
			}
			
			else {
				System.out.println("잘못된 번호 입력!");
			}
		}
		
	}

}
