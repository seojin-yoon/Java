package api.util.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test03 {

	public static void main(String[] args) {
		// �̸��� ��ȭ��ȣ�� ������ �� �ִ� Ŭ������ ����� set���� �����ϱ�...
		// ������ �߰�,����,����
		// ��, ���� �̸��� �߰��� �Ұ���.. ������ �̸��� ������ ��츸 ����
		
		Set<Info> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			boolean check = true;
			Iterator<Info> it = null;
			String name = null;
			String tel = null;
			
			System.out.println("1.�߰� 2.���� 3.���� 4.����\n��ȣ�� �Է��ϼ���: ");
			int num = sc.nextInt();
			sc.nextLine(); //enter�� ����(buffer ����)
			if(num == 1) {
				System.out.println("�̸�: ");
				name = sc.next();
				System.out.println("��ȣ: ");
				tel = sc.next();
				for(Info in:set) {
					if(in.getName().equals(name)) {
						System.out.println("���� �̸��� �����մϴ�");
						check =false;
						break;
					}
				}
				if(check) {
					set.add(new Info(name,tel));
					System.out.println(name+"���� ������ �߰��Ǿ����ϴ�");
				}
				
			}
			else if(num == 2) {
				System.out.println("������ �̸� �Է�: ");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					Info in = it.next(); //ù��° ��ü�� in�� �̾ƿ�
					if(in.getName().equals(name)) {
						it.remove();
						System.out.println(name+"���� ������ �����Ǿ����ϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("�̸��� ã�� ���߽��ϴ�");
				}
			}
			else if(num == 3) {
				
			}
			else if(num == 4) {
				break;
			}
			else {
				System.out.println("�߸��� ��ȣ �Է�!");
			}
		}
		
		
		
		
		
		

	}

}
