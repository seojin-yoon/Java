package api.lang.string;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// ������ ����
		//(��Ģ)
		//[1]����ڿ��� ����ؼ� �ܾ �Է¹޽��ϴ�
		//[2]�Էµ� �ܾ 3���ڰ� �ƴϸ� ������ �����մϴ�
		//[3]���� �Էµ� �ܾ��� ������ ���ڿ� 
		//���� �Է��� �ܾ��� ù���ڰ� ���� ���� ����, �ƴϸ� �����մϴ�
		// (��) �ٳ���->����(2���ڶ� ����)
		//	���� -> ������ -> �̴ϼ� -> ������ (��/ó�� ����ġ�� ����)
		String word1 = null;//�����ܾ�
		String word2 = null;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			//����1
			System.out.println("�ܾ �Է��ϼ���: ");
			word1 = word2;//ó��: null
			word2 = sc.next();//���� �ܾ� �Է� 		ó��: ����
			if(word2.length()!=3) {
				System.out.println("3���ڷ� �Է����ּ���");
				break;
			}
			//����2
			else if(word1!=null) {//ù��° ���� x
				char a = word1.charAt(2);
				char b = word2.charAt(0);
				if(a!=b) {//char���� ��ü�� �ƴ϶�  ==,!=  ����  �񱳰���(equals() ���x)
					System.out.println("��Ģ  ����!");
					break;
				}
				
			}
			System.out.println("word1="+word1);
			System.out.println("word2="+word2);
			
		}
	}
}