package api.util.collection.map;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		/*���۸��� ��ǰ ��� ���α׷�
		 * �Ʒ��� ���°� �����ǵ��� Map�� �̿��� ���α׷����ϼ���
		 * (��) ��ǰ�̸�: ���̽�
		 * 		��ǰ����: 1200
		 * 		��ǰ����� �Ϸ�Ǿ����ϴ�... ���� ��ǰ 1���� ��ϵǾ� �ֽ��ϴ�.
		 * 		��ǰ�̸�: ��Ϲ���Ĩ
		 * 		��ǰ����: 2000
		 * 		��ǰ����� �Ϸ�Ǿ����ϴ�... ���� ��ǰ 2���� ��ϵǾ� �ֽ��ϴ�.
		 * 		��ǰ�̸�: ���̽�
		 * 		��ǰ����: 1200
		 * 		�̹� ��ϵ� ��ǰ�Դϴ�. ������ �����Ͻðڽ��ϱ�?(Y/N) //�ҹ��ڵ� �����ϰ� �϶�
		 * 		(Y)���� ������ �Ϸ�Ǿ����ϴ� / (N)��ǰ ����� ��ҵǾ����ϴ�
		 * key���� ����Ұ���, value���� ���氡�� 
		 */
		
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> mart = new HashMap<String,Integer>();//<>�ȿ��� �տ��� �������ϱ� ���� �Ƚ��൵�ȴ�
		
		while (true) {
			System.out.print("��ǰ�̸�: ");
			String name = sc.next();
			System.out.print("��ǰ����: ");
			int price = sc.nextInt();
			if(mart.containsKey(name)) {
				System.out.println("�̹� ��ϵ� ��ǰ�Դϴ�.\n������ �����Ͻðڽ��ϱ�?(Y/N)");
				char select = sc.next().charAt(0);
				//String select = sc.next();
				//select.toLowerCase().equals('y'); //���� �ҹ��ڷ� �ٲ㼭 y�� ���ص� ��
				if(select=='Y'||select=='y') {
					Integer origin = mart.get(name);
					mart.replace(name,price); //mart.put(name,price);�� �ᵵ ��
					System.out.println(name +" �� ������ "+origin+"������ "+price+"������ ����Ǿ����ϴ�");
				}
				else {
					System.out.println("��ǰ ����� ��ҵǾ����ϴ�");
				}
				
			}
			else {
				mart.put(name, price);
				System.out.println("��ǰ����� �Ϸ�Ǿ����ϴ�... ���� ��ǰ�� "+mart.size()+"���� ��ϵǾ� �ֽ��ϴ�.");
			}
		}
		
		
		
		
		
	}

}
