package oop.test02;

public class Player {
	//Main.java: 메인을 갖는 클래스
	//Player.java: 게임 캐릭터 클래스
	//(구성항목)	아이디(id),공격력(atk),체력(hp),공격대상(target)
	//atk과 hp는 양수만 설정되도록 구현( >0)
	
	private String id;
	private int atk,hp;
	private Player target; //String target이 아님!
	
	
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
			System.out.println("공격력을 잘못 입력하셨습니다.");
			this.atk = 1;
			return;
		}
		this.atk = atk;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("체력을 잘못 입력하셨습니다.");
			this.hp = 1;
			return;
		}
		this.hp = hp;
	}
	
	public void setTarget(Player target) { //String target이 아님!
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
		target.hp -= this.atk; //한번공격:0=80-10; 60=70-10; 
		//this.setTarget()할 필요 없음!
	}
	
	
	public void disp() {
		System.out.println("아이디: "+id+"\t체력: "+hp+"\t\t공격력: "+atk+"\t상대방: "+target.getId());
	}
}


