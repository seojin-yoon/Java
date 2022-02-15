package api.util.collection.list;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		//list: �������� �ߺ��� ���ǰ� �������� ������ �����Ǵ� �������� ����� �����ϴ� �÷���
		//:Ȯ���� �迭
		
		List<String> list = new ArrayList<String>();
		
		//�����Ͱ� ����ִ��� Ȯ��
		System.out.println(list.isEmpty());
		
		//������ �߰� .add
		
		list.add("Black");//0��° �ε���
		list.add("Red");//1
		list.add("White");//2->3
		list.add("Green");//3->4
		list.add("Gray");//4->5
		list.add("Black");//5->6
		
		
		list.add(2,"Pink");//2
		//�������� ����
		System.out.println(list.size());
		
		//������ ���� �˻�: .contains(E);
		System.out.println(list.contains("Black"));
		System.out.println(list.contains("black"));
		System.out.println("===============================");
		
		//������ ����: .get(i);
		String color = list.get(2);
		System.out.println(color);
		System.out.println("===============================");
		
		
		//��ü ������ ����
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===============================");
		//.indexOf(E): ���ϴ� �������� �ε�����ȣ ��ȯ
		System.out.println(list.indexOf("Black"));
		System.out.println(list.lastIndexOf("Black"));//�ڿ�������
		System.out.println("===============================");
		//������ ����: .remove(E)  .remove(i)
		list.remove(0); //Black ����
		list.remove("Pink"); //Pink ����
		//��ü ������ ����
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===============================");
		List<String> sub = list.subList(0,2);//2�̸����� �ڸ���
		
		for (int i=0;i<sub.size();i++) {
			System.out.println(sub.get(i));
		}
		
		
		
	}

}
