package poly03;

public abstract class Animal {
//�߻�Ŭ����
	//-abstract�� �ٿ��� ������ Ŭ����
	//-�߻�޼ҵ带 ������ �ִ� Ŭ����..X
	//-�θ��� ������ �����ϱ� ���� ��������� Ŭ����
	//-�Ϲ������� ��ü ���� �Ұ�.. �͸� ��øŬ������ ���� �ӽ������� ��ü ���� ����
	//-�ڽ� Ŭ�������� �߻�޼ҵ带 �������̵� ���־���Ѵ�.
	// �߻�޼ҵ带 �������̵����� ������ �ڽ� Ŭ������ �߻�Ŭ������ �������Ѵ�.
	private String name;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	//�߻�޼ҵ� - �󲮵��� �޼ҵ�
	//-�������� ���ؼ� �θ�Ŭ������ �����ϴ� �޼ҵ�
	//-�θ�Ŭ���������� ������ ������ �������� ������ �������� ���ؼ� �����Ѵ�.
	//-abstract�� �ٿ��� �����Ѵ�.
	public abstract void bark();
	public abstract void eat();
	
}
