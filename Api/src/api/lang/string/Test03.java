package api.lang.string;

public class Test03 {

	public static void main(String[] args) {
		String url = "https://www.naver.com";
		
		//���ڿ� ����
		//������ ��ġ�� �ε������� ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ�
		System.out.println(url.substring(7));
		//������ ��ġ �ε������� ���ε��� �̸�����
		System.out.println(url.substring(7,10));
	
		//.replace
		System.out.println(url.replace('/', '+'));
		
		
		url = "                 http://www.naver.com   ";
		//.trim - ��������
		System.out.println(url.trim()+ url.trim().length());
	}

}
