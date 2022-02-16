package api.util.collection.set;

import java.util.*;
import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// Set
		//:������ �ߺ��� ������� �ʰ� �������� ��������� ���� �÷���
		//:������ ��ü�� �����ϴ� �뵵�� ���� ���ȴ�.
		
		//���ʸ�
		//:���� ���ϴ� Ÿ������ ������ִ� ����
		//:��� ���α׷������� ���� ������ �ʿ��� ����..
		
		Set<String> set = new HashSet<>();
		//���� ��Ȳ�� ���ʸ�<String>�� ������ HashSet�ȿ� ����� ����� Ÿ���� �����ϴ� ����
		
		//������ �߰�- .add
		set.add("Black");
		set.add("Red");
		set.add("White");
		set.add("Green");
		set.add("Gray");
		set.add("Black");
		
		//�������� ����- .size()
		System.out.println(set.size());
		
		//set�ȿ� ������ �ִ��� ������ �Ǵ��ϴ� �޼ҵ�- isEmpty()
		//-��� ������ true
		System.out.println(set.isEmpty());
		
		
		//.iterator();**
		//:������ �������� �ʴ� ��� ��ü���� ������ �ִ� ���·� ��ȯ���ִ� Ŭ����
		//:�ݺ��Ͽ� �����͸� ������ �� �ְ� ������ִ� Ŭ����
		//:set�� �ڷ����� �����͸� ������ �� �ִ� ����� ����.
		//:Iterator ��ü�� ���� �����͸� �����ϰ� �ȴ�.
		//:set���� remove�� �ϸ� Iterator�� ������ ����ȭ�� ���� �ʱ� ������
		//	������ �߻�.. iterator���� remove���־���Ѵ�. ****
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {//������������ ����
			String color = it.next();//�����͸� �����´�.
			System.out.println(color);
		}
		it = set.iterator();
		//set.remove("Red"); -������
		it.next();
		it.remove();
		while(it.hasNext()) {//������������ ����
			String color = it.next();//�����͸� �����´�.
			System.out.println(color);
		}
		
		for(String color:set) {
			System.out.println(color);
		}
	}

}
