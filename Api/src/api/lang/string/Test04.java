package api.lang.string;

public class Test04 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// ����1)���� ���
		// ����1)33��
		
		// ����2)���� ���
		// ����2)����

		String strAge = jumin.substring(0,2);
		int intAge = Integer.parseInt(strAge);
		
		int age = 2022-(intAge+1900)+1;
		System.out.println(age+"��");
		char key = jumin.charAt(7);
		
		if (key =='1' || key =='3') {
			System.out.println("����");
		}
	}

}
