package api.util.collection.list;

import java.util.*;


public class Test01 {

	public static void main(String[] args) {
		/*
		 * Mobile m[] = new Mobile[]{
		 * 
		 * };
		 */
		//Mobile Ŭ������ ������ list�� ��� �����?
		//list�� Mobile�� �߰�(��ü �߰�)
		List<Mobile> m = new ArrayList<>();
		m.add(new Mobile("V20","LG",30));
		m.add(new Mobile("G5","SK",35));
		m.add(new Mobile("G6","KT",40));
	
		//��ü ���
		for (int i=0;m.size()<3;i++) {
			//Mobile a = m.get(i); //���� �ǹ��� Mobile a = new Mobile("V20","LG",30);
			//a.disp(i+1);
			m.get(i).disp(i+1);
		}
		int su = 1;
		for (Mobile a:m) {//�׻� for��: m�ȿ� �ִ� �����͸� ���� ����
							//m�ȿ� �ִ� �����Ͱ� ���������� ����
			a.disp(su);
			su++;
		}
		
		
	
	}

}
