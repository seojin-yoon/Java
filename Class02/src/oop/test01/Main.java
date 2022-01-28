package oop.test01;

public class Main {

	public static void main(String[] args) {
		//��ü ������ �Ʒ��� ������ ����
		// 		name	telecom 	price
		//[1]	������S8	SKT			30����
		//[2]	G6		LG			33����
		//[3]	������7	KT			51����
		//�������� ������ 8�� ������ ���Ͽ� ��� �޴��� �̸��� ���
		
		Mobile m3 = new Mobile("������S8","SKT",30);
		Mobile m1 = new Mobile("G6","LG",33);
		Mobile m2 = new Mobile("������7","KT",51);

		System.out.println("name\t\ttel\t\tprice");
		m1.disp();
		m2.disp();
		m3.disp();
		
		//��ü �迭
		Mobile[] arr = new Mobile[3]; //�迭 ���� �����
		arr[0] = new Mobile("������S8","SKT",30); //�迭[0]�ε����� ��ü ����
		arr[1] = new Mobile("G6","LG",33);
		arr[2] = new Mobile("������7","KT",51);
		
		
		for (int i=0;i<3;i++) {
			arr[i].disp();
		}
		
		
		//m1.setName("***") - private�̱� ������ main������ ��� �Ұ���
		
		if (m1.getPrice() > m2.getPrice()) {
			if (m1.getPrice() > m3.getPrice()) {
				System.out.println(m1.getName()); 
			}
		}
		else {
			if (m2.getPrice() > m3.getPrice()) {
				System.out.println(m2.getName()); 
			}
			else {
				System.out.println(m3.getName()); 
			}
		}
		
		//���� ���ϴ� �޼ҵ�
		arr[0].compare(arr[2]); //�Ű������� �Ѿ�� ������ : arr[2]�ִ� ��ü
								//this�� ��� : arr[0]�ִ� ��ü
		
	}

}
