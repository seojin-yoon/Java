package api.util.collection.set;

public class Info {
	//�̸�,��ȭ��ȣ ����
	
	private String name, tel; //int�� �ϸ� 010�� 0�� �ȵ�
	
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
