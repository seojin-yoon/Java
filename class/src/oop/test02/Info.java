package oop.test02;

public class Info {
	//�������
	String name;
	int age, score;
	
	//�޼ҵ�
	void setData(String _name,int _age,int _score) {
		name = _name;
		age = _age;
		score = _score;
	}
	
	void display() {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("����: "+score);
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getScore() {
		return score;
	}
	
	
}
