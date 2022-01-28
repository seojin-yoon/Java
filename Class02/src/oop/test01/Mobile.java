package oop.test01;

public class Mobile {
	//Main.java: main()�� ������ Ŭ����
	//Mobile: �޴���ȭ Ŭ����
	//�ܼ��� ����� �Ϳ� ��ġ�� ����, �������� ���̱� ���� ������ ���� ���� ����
	//[1]�̸��� �ѹ� �����ϸ� ����� ������ �� �����ϴ�.(����������)
	//[2]������ �ƹ��� �ΰ� �����ص� 40���� �̸��� �Ұ����մϴ�
	//	20�������� ������ 40�������� �����ǵ���
	//[3]��Ż糪 ���� ���� ��� ���� ������ �����ϵ���
	
	private String name,tel;
	private int price;
	
	public Mobile(String name, String tel, int price) {
		this.setName(name); //setName �޼ҵ� �ҷ���
		this.tel = tel; 
		this.setPrice(price);
		
	}
	
	//setter
	private void setName(String name) { //Ŭ���� �������� ��밡��, but ���ο����� ���ٺҰ���
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setPrice(int price) {
		if (price < 40) {
			System.out.println("������ �߸� �����ϼ̽��ϴ�.");
			this.price = 40;
			return;
		}
		this.price = price;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getTel() { 
		return tel;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void disp() {
		System.out.println(name+"\t\t"+tel+"\t\t"+price);
	
	}
	
	public void compare(Mobile m) {
		if (this.price < m.price) { //m�� �ϳ��� ��ü(�Ű������� �޾ƿ� ��ü��)
			System.out.println(m.getName());
			
		}
		else if(this.price > m.price) {
			System.out.println(this.getName());
		}
		else{
			System.out.println("����");
		}
	}
	
}
