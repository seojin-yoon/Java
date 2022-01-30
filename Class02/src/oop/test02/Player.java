package oop.test02;

public class Player {
	//Main.java: ������ ���� Ŭ����
	//Player.java: ���� ĳ���� Ŭ����
	//(�����׸�)	���̵�(id),���ݷ�(atk),ü��(hp),���ݴ��(target)
	//atk�� hp�� ����� �����ǵ��� ����( >0)
	
	private String id;
	private int atk,hp;
	private Player target; //String target�� �ƴ�!
	
	
	public Player(String id, int atk, int hp){
		this.id = id;
		this.setAtk(atk);
		this.setHp(hp);
	}
	
	
	//setter
	public void setId(String id) {
		this.id = id;
	}

	public void setAtk(int atk) {
		if (atk < 0) {
			System.out.println("���ݷ��� �߸� �Է��ϼ̽��ϴ�.");
			this.atk = 1;
			return;
		}
		this.atk = atk;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("ü���� �߸� �Է��ϼ̽��ϴ�.");
			this.hp = 1;
			return;
		}
		this.hp = hp;
	}
	
	public void setTarget(Player target) { //String target�� �ƴ�!
		this.target = target;
	}
	
	//getter
	public String getId() {
		return id;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getHp() {
		return hp;
	}
	
	public Player getTarget() {
		return target;
	}
	
	public void attack() {
		target.hp -= this.atk; //�ѹ�����:0=80-10; 60=70-10; 
		//this.setTarget()�� �ʿ� ����!
	}
	
	
	public void disp() {
		System.out.println("���̵�: "+id+"\tü��: "+hp+"\t\t���ݷ�: "+atk+"\t����: "+target.getId());
	}
}


