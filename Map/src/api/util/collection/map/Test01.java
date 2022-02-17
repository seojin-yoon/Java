package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// Map: Key�� Value���� �ѽ����� �����͵��� �����ϴ� �÷���
		//:Key���� ���Ͽ� value���� �����Ѵ�.
		//:key-�ߺ��Ұ�	value-�ߺ�����
		//:������ �������� �ʴ´�.
		//:�������� �⺻������ ������ �̵��� ���Ǵ� ���� map�̴�.
		
		//ex> ���̵�:key��, ��й�ȣ:value������ ����
		
		Map<String,Integer> map = new HashMap<String,Integer>();//<>�ȿ��� �տ��� �������ϱ� ���� �Ƚ��൵�ȴ�
		
		//������ �߰�: put(key,value);
		map.put("Black", 1);
		map.put("White", 2);
		map.put("Gray", 3);
		map.put("Blue", 4);
		map.put("Red", 5);
		map.put("Green", 6);
		map.put("Black", 2);//���� key��(ex>"Black")�� ���� ��� value���� �����Ų��
		System.out.println(map.get("Black")); //2
		System.out.println("======================================");
		
		//������ ����: .replace(K,V);
		map.replace("Black", 3);//key������ ã�Ƽ� ���� key���� value���� ����
		System.out.println(map.get("Black")); //3
		System.out.println(map.replace("black",4)); //null������: key��("black")�� �������� ����
		System.out.println(map.get("black")); //null�� ����: ���� key���� null�� ��ȯ�Ѵ�
		System.out.println("======================================");
		
		//.containsKey(K)	containsValue(V): �������� ����(�����Ͱ� �ִ��� ������)�� Ȯ���ϴ� �޼ҵ�
		System.out.println(map.containsKey("Black")); //true
		System.out.println(map.containsKey("Pink")); //false
		System.out.println(map.containsValue(1)); //false
		System.out.println(map.containsValue(3)); //true (Gray,Black)
		System.out.println("======================================");
		
		//.size(): map�� �������� ����
		System.out.println(map.size());
		System.out.println("======================================");
		
		
		//.get(key): ������ ����
		System.out.println(map.get("Black")); //3
		System.out.println(map.get("black")); //null�� ����: key���� ������ null�� ��ȯ�Ѵ�
		System.out.println("======================================");
		
		//.remove(key): ������ ����
		System.out.println(map.get("Black")); //3
		map.remove("Black");
		System.out.println(map.get("Black")); //���� �� null
		System.out.println("======================================");
		
		//������ ��ü ����: map�� set���� �����, set�� iterator�� ������ ��� ����
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next(); //key���� ������
			int value = map.get(key); //value���� key���� ���ؼ��� ������ �� �ִ�
			System.out.println("Key: "+key+"\tValue: "+value);
		}
		System.out.println("======================================");
		
		//.clear(): map�ȿ� �����͵��� ��� ���� ����
		map.clear();
		System.out.println(map.size());
	}

}
