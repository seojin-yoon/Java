package api.util.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test03 {

	public static void main(String[] args) {
		// 이름과 전화번호를 저장할 수 있는 클래스를 만들고 set으로 관리하기...
		// 데이터 추가,삭제,보기
		// 단, 같은 이름은 추가가 불가능.. 삭제도 이름이 동일할 경우만 삭제
		
		Set<Info> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			boolean check = true;
			Iterator<Info> it = null;
			String name = null;
			String tel = null;
			
			System.out.println("1.추가 2.삭제 3.보기 4.종료\n번호를 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine(); //enter값 제거(buffer 비우기)
			if(num == 1) {
				System.out.println("이름: ");
				name = sc.next();
				System.out.println("번호: ");
				tel = sc.next();
				for(Info in:set) {
					if(in.getName().equals(name)) {
						System.out.println("같은 이름이 존재합니다");
						check =false;
						break;
					}
				}
				if(check) {
					set.add(new Info(name,tel));
					System.out.println(name+"님의 정보가 추가되었습니다");
				}
				
			}
			else if(num == 2) {
				System.out.println("삭제할 이름 입력: ");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					Info in = it.next(); //첫번째 객체를 in에 뽑아옴
					if(in.getName().equals(name)) {
						it.remove();
						System.out.println(name+"님의 정보가 삭제되었습니다");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("이름을 찾지 못했습니다");
				}
			}
			else if(num == 3) {
				
			}
			else if(num == 4) {
				break;
			}
			else {
				System.out.println("잘못된 번호 입력!");
			}
		}
		
		
		
		
		
		

	}

}
