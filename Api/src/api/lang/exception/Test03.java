package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = 0,b=1;
			
			try {
				System.out.println("�����Է�:");
				a=sc.nextInt();
				System.out.println("�����Է�:");
				b=sc.nextInt();
			
				System.out.println(a+"/"+b+"="+(a/b));
			}catch(ArithmeticException e) {
				System.err.println("0���� ���� �� �����ϴ�.");
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.err.println("������ �Է��ϼžߵ˴ϴ�");
			}catch(Exception e) {
				sc.nextLine();
				//���߿� �ܼ� �α�
				e.printStackTrace();
			}
		}
	
	
	}

}
