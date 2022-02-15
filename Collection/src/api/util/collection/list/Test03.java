package api.util.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		// 
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<=10;i++) {
			list.add(i);//�߰��� int/Integer ���� (auto-boxing)
			
		}
		System.out.println(list);
		
		//List�� ��� Collection�̶�� ���� Ŭ������ ������ �޾� �پ��� ó���� ������ �� �ִ�
		
		//(cf) Arrays Ŭ����
		//[1]������ ���� ��� 	.shuffle()
		Collections.shuffle(list);
		System.out.println(list);
		
		//[2]������ ���		.reverse()
		Collections.reverse(list);
		System.out.println(list);
		
		//[3]���� ���		.sort()
		Collections.sort(list);
		System.out.println(list);
		
	}

}
