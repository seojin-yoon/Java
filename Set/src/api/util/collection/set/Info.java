package api.util.collection.set;

public class Info {
	//이름,전화번호 저장
	
	private String name, tel; //int로 하면 010의 0이 안들어감
	
	public Info(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public void disp() {
		System.out.println("["+"]"+name+"\t"+tel);
	}
}
