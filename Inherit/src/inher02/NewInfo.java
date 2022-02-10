package oop.inher02;

public class NewInfo extends Info{
	private double hei;
	
	//this: �ڱ��ڽ��� ���� (�ڽ�)
	//super: �θ� ����
	
	//���ٸ� ��ð� ������ �ڽ�Ŭ���������� �θ��� ����Ʈ�����ڰ� ȣ��ȴ�.
	//�θ��� ����Ʈ �����ڰ� ������ ���� �߻�..
	
	public NewInfo() {
		System.out.println("�ڽ� ����Ʈ ������ ����!");
	}
	
	//�θ��� ��������� �ʱ�ȭ �Ϸ��� �ڽ�Ŭ������ �����ڿ��� �θ��� ��������ʱⰪ���� �Բ�
	//�޾��־���Ѵ�.
	
	public NewInfo(String name, int age, double hei) {
		super(name,age);//�θ�����ڿ� ���� �ѱ��. //�Ű����� ���� �߿�!
		this.hei = hei;//�ڽ�(�ڱ��ڽ�)
		System.out.println("�ڽ� ������");
	}
	
	public void setHei(double hei) {
		this.hei = hei;
	}
	
	public void disp() {
		super.disp();//�θ�޼ҵ� disp�� ������
		System.out.println("Ű:"+hei);//�ڽ� �������
		
		System.out.println("===============================");
		
		System.out.println("�̸� : "+super.getName());
		System.out.println("���� : "+super.getAge());
		
		//System.out.println("�̸� : "+super.name); - ���� ��
		//�θ��� private���� ���ٺҰ�
	}
}
