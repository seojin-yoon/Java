package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = 0,b=1;
			//throw - ���� ���� �߻�
			try {
				System.out.println("�����Է�:");
				a=sc.nextInt();
				System.out.println("�����Է�:");
				b=sc.nextInt();
				if(b==0) {
					throw new Exception("0���� ���� �� �����ϴ�");
				}
				System.out.println(a+"/"+b+"="+(a/b));
			}catch(Exception e) {
				sc.nextLine();
				//���߿� �ܼ� �α�
				e.printStackTrace();
			}
		}
	
	
	}

}
