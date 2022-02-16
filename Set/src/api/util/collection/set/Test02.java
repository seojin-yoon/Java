package api.util.collection.set;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		// [���� ��� ���α׷� ����]
		//����ڿ��� ����ؼ� �������� �Է¹޾� �����ϴ� ����Ҹ� �����Ϸ��� �Ѵ�
		//�̹� ��ϵ� å�̸� ����� �����Ǿ����� �Ѵ�
		//1.������� 2.�������� 3.�������� 4.����
		Set<String> set = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean check = true;
			String book = null;
			Iterator<String> it = null;
			System.out.println("1.������� 2.�������� 3.��������\n��ȣ�� �Է��ϼ���: ");
			int num = sc.nextInt();
			sc.nextLine(); //enter�� ����(buffer ����)
			if (num==1) {
				System.out.println("������ ����ϼ���: ");
				
				book = sc.nextLine();
				if(set.contains(book)) {
					System.out.println("�̹� ��ϵ� �����Դϴ�.");
					
				}
			
				else {
					set.add(book);
					System.out.println("������ : "+book);
					System.out.println("���� ����� �Ǿ����ϴ�... ���絵�� "+set.size()+"��");
			
				}
			}
			else if(num==2) {
				System.out.println("������ �����ϼ���: ");
				book = sc.nextLine();
				it = set.iterator();
				
				while(it.hasNext()) {//������������ ����
					String bk = it.next();//�����͸� �����´�.
					if(bk.equals(book)) {
						it.remove();
						System.out.println(book+"å�� �����Ǿ����ϴ�");
						check = false;
						break;
					}
					System.out.println("���������� �����Ǿ����ϴ�");
				}
				if(check) {
					System.out.println("å �̸��� ã�� ���߽��ϴ�");
				}
			}
			
			else if(num == 3){
				
				book = sc.nextLine();
				if(set.contains(book)) {
					System.out.println(book+"������");
				}
			}
		}
	}

}
