package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// Exception - ����
		//-���α׷� ���� �߿� �ܺ����� �������� ���� �߻��ϴ� ����
		//-���ܴ� �츮�� ó�� �����ϴ�.
		//-���� �߻��Ǵ� ���ܵ��� Ŭ����ȭ ���ѳ��Ҵ�.
		
		//����ó��
		//-���ܰ� �߻������� ���α׷��� ���������� �۵��� �� �ֵ��ΰ� ó���ϴ°�..
		
		//����� �ΰ����� �����Ѵ�.
		//		1.throws
		//		2.try~catch - ���� ���� ���ܸ� ó���ϴ� ���
		//		-try:���� ���� ���� ��� - �ʼ�
		//		-catch:���� ó�� ��� - �ʼ�
		//		-finally:�ʼ� �ڵ带 ���� ��� - ����
		
		//-����
		//		try{
		//		}catch(ó���� ���� Ŭ������ ������ ���� ����){//�Ű�����ó�� �����ϸ�ȴ�.
		//			ó���ڵ�����
		//		}finally{
		//			�ʼ��ڵ�����
		//		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = 0,b=1;
			
			try {
				System.out.println("�����Է�:");
				a=sc.nextInt();
				System.out.println("�����Է�:");
				b=sc.nextInt();
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.err.println("������ �Է��ϼžߵ˴ϴ�");
			}
			
			try {
				System.out.println(a+"/"+b+"="+(a/b));
			}catch(ArithmeticException e) {
				System.err.println("0���� ���� �� �����ϴ�.");
			}
		}
		
		
	}

}
