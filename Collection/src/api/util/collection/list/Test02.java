package api.util.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// [���� ��� ���α׷� ����]
		//����ڿ��� ����ؼ� �������� �Է¹޾� �����ϴ� ����Ҹ� �����Ϸ��� �Ѵ�
		//�̹� ��ϵ� å�̸� ����� �����Ǿ����� �Ѵ�
		//1.������� 2.�������� 3.�����˻�
		
		List<String> list = new ArrayList<>();//������
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.������� 2.�������� 3.�����˻�\n��ȣ�� �Է��ϼ���: ");
			int num = sc.nextInt();
			sc.nextLine(); //enter�� ����(buffer ����)
			if (num==1) {
				System.out.println("������ ����ϼ���: ");
				
				String book = sc.nextLine();
				if(list.contains(book)) {
					System.out.println("�̹� ��ϵ� �����Դϴ�.");
					
				}
				else if(book.equals("����")) {
					System.out.println("���α׷��� �����Ѵϴ�");
					break;
				}
				else {
					list.add(book);
					System.out.println("������ : "+book);
					System.out.println("���� ����� �Ǿ����ϴ�... ���絵�� "+list.size()+"��");
			
				}
			}
			else if(num==2) {
				System.out.println("������ �����ϼ���: ");
				String book = sc.nextLine();
				if(list.contains(book)) {
					list.remove(book);
					System.out.println("���������� �����Ǿ����ϴ�");
				}
				else {
					System.out.println("�����Ͻ� ������ �����ϴ�");
				}
				
			}
			
			else if(num == 3){
				System.out.println("�˻��Ͻ� ���� �Է�: ");
				String book = sc.nextLine();
				if(list.contains(book)) {
					System.out.println(book+"������"+(list.indexOf(book)+1)+"��°�� �ֽ��ϴ�");
				}
				else {
					System.out.println("ã���ô� ������ �����ϴ�");
				}
			}
			
			else {
				System.out.println("�߸��� ��ȣ �Է�!");
			}
		}
		
	}

}
