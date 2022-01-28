package oop.test02;

public class Player {
	//Main.java: ������ ���� Ŭ����
	//Player.java: ���� ĳ���� Ŭ����
	//(�����׸�)	���̵�(id),���ݷ�(atk),ü��(hp),���ݴ��(target)
	//atk�� hp�� ����� �����ǵ��� ����( >0)
	
	private String id,target;
	private int atk,hp;
	
	
	Player(String id, int atk, int hp){
		this.id = id;
		this.setAtk(atk);
		this.setHp(hp);
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getId() {
		return id;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getHp() {
		return hp;
	}
}


