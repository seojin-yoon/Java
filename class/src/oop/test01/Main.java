package oop.test01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info in = new Info(); //Ŭ������: Info ��ü��: in 
		//Scanner sc = new Scanner(System.in);
		//sc: ��ü��
		in.setData("ȫ�浿", 20); //���ڰ�: �Ű������� ���� ������ ex> ȫ�浿�� setData�� �Ű����������� ��
		in.disp();
		String name = in.getName(); //�޼ҵ忡�� -> �޼ҵ带 ȣ���� ��ҷ� ���� �����ش�.
		System.out.println(name);
		
		Info in2 = new Info();
		in2.setData("�̸���", 35);
		in2.disp();
		in.disp();
	}

}




































