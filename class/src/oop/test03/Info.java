package oop.test03;

public class Info {
	String name;
	int age, kor, eng, math, tot;
	double avg;
	
	void setData(String _name, int _age, int _kor, int _eng, int _math) { //�Ű������� ���ο��� �޾ƿ��� ����
		name = _name;
		age = _age;
		kor = _kor;
		eng = _eng;
		math = _math;
	}
	
	void sum() {//�� ������ void�� �ϸ� �ȴ�.
		tot = kor+eng+math;
		
	}
	
	void divide() {
		avg = tot/3;
	}
	
	
	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("�����:"+kor);
		System.out.println("�����:"+eng);
		System.out.println("���м���:"+math);
		System.out.println("����:"+tot);
		System.out.println("���:"+avg);
	}
}
