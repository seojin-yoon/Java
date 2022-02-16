package api.util.collection.set;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		// [도서 등록 프로그램 구현]
		//사용자에게 계속해서 도서명을 입력받아 저장하는 저장소를 구현하려고 한다
		//이미 등록된 책이면 등록이 거절되었으면 한다
		//1.도서등록 2.도서삭제 3.도서보기 4.종료
		Set<String> set = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean check = true;
			String book = null;
			Iterator<String> it = null;
			System.out.println("1.도서등록 2.도서삭제 3.도서보기\n번호를 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine(); //enter값 제거(buffer 비우기)
			if (num==1) {
				System.out.println("도서를 등록하세요: ");
				
				book = sc.nextLine();
				if(set.contains(book)) {
					System.out.println("이미 등록된 도서입니다.");
					
				}
			
				else {
					set.add(book);
					System.out.println("도서명 : "+book);
					System.out.println("도서 등록이 되었습니다... 현재도서 "+set.size()+"개");
			
				}
			}
			else if(num==2) {
				System.out.println("도서를 삭제하세요: ");
				book = sc.nextLine();
				it = set.iterator();
				
				while(it.hasNext()) {//다음데이터의 유무
					String bk = it.next();//데이터를 가져온다.
					if(bk.equals(book)) {
						it.remove();
						System.out.println(book+"책이 삭제되었습니다");
						check = false;
						break;
					}
					System.out.println("정상적으로 삭제되었습니다");
				}
				if(check) {
					System.out.println("책 이름을 찾지 못했습니다");
				}
			}
			
			else if(num == 3){
				
				book = sc.nextLine();
				if(set.contains(book)) {
					System.out.println(book+"도서는");
				}
			}
		}
	}

}
