package oop.inher03;

public class MobileEx extends Mobile {

	//������ Mobile�̶�� Ŭ������ ����Ͽ� �޴���ȭ ������ �����Ͽ����ϴ�.
	//������ ������ �׸���� �߰��� �Ǿ����ϴ�.
	//Mobile�̶�� Ŭ������ �ǵ帮�� �ʰ� ����� �̿��Ͽ� �߰��� �׸���� �����ϰ� ����� �ͽ��ϴ�.
	//�̸��� MobileEx�� ����
	//(�߰��� �׸�) ����ī��(card) 		���÷� ���� / Ȯ�� ����
	//			  �����Ⱓ(month) 	�޴��� �����Ⱓ(�� ����)
	
	
	private String card;
	private int month;
	public MobileEx(String name,String tel,int price, String card, int month) {
		super(name,tel,price);
		this.card = card;
		this.month = month;
	}
	
	public void setCard(String card) {
		this.card = card;
	}
	public void setMonth(int Month) {
		this.month = month;
	}
	
	public String getCard() {
		return card;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void disp() {
		super.disp();
		System.out.println("\t"+card+"ī��"+"\t"+month+"����");
	}
}
