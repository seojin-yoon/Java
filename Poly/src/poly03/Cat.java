package poly03;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		}

	@Override //�̰ǾȽᵵ������
	public void bark() {//�θ��� �߻�޼ҵ�� �ݵ�� �ڽĿ��� �������̵� �Ǿ���Ѵ�.
		System.out.println("�߿�");
	}
	public void eat() {
		System.out.println("����");
	}
}
