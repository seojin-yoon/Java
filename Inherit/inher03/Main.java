package oop.inher03;

public class Main {

	public static void main(String[] args) {
		// (�Ʒ��� ��ü�� ������ �� ���� ���)
		//name	 	telecom	price	card	month
		//������7 	KT		90����	����ī��	24����
		//������7	 	SK		30����	����ī��	30����
		//G6		LG		35����	�Ｚī��	36����
		
		Mobile m1 = new MobileEx("������7","KT",90,"����",24);
		Mobile m2 = new MobileEx("������7","SK",30,"����",30);
		Mobile m3 = new MobileEx("G6","LF",35,"�Ｚ",36);
		System.out.println("name\ttelecom\tprice\tcard\tmonth");
		m1.disp();
		m2.disp();
		m3.disp();
	}

}
