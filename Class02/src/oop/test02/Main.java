package oop.test02;

public class Main {

	public static void main(String[] args) {
		//	 id		atk		hp		���ݴ��
		//[1]�Ƿη�	10		100		Ÿ��
		//[2]Ÿ��		15		80		�Ƿη�
		
		//[1]�� [2]�� �����Ͻð� ������ ����� �� ���� 2�� �����ϸ� ��� �Ǵ��� ����
		//attack()�޼ҵ带 Player�� �߰��� ����,
		//�����ϸ� ������ ü���� ���� ���ݷ¸�ŭ ���ҵǵ��� ����
		
		Player p1 = new Player("�Ƿη�",10,100);
		Player p2 = new Player("Ÿ��",15,80);
		
		p1.setTarget(p2);
		p2.setTarget(p1);
		
		p1.disp();
		p2.disp();
		
		System.out.println("���� ����!");
		
		
		for (int i=0;i<2;i++) {
			p1.attack();
			p1.disp();
			p2.disp();
			
			p2.attack();
			p1.disp();
			p2.disp();
		}
		
		
	}

}
