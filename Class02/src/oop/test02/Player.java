package oop.test02;

public class Player {
	//Main.java: 메인을 갖는 클래스
	//Player.java: 게임 캐릭터 클래스
	//(구성항목)	아이디(id),공격력(atk),체력(hp),공격대상(target)
	//atk과 hp는 양수만 설정되도록 구현( >0)
	
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


