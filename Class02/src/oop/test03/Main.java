package oop.test03;

public class Main {

	public static void main(String[] args) {
		Array array = new Array(5); //���ڸ� ���� ��ŭ �迭�� ũ��
		
		
		int[] arr = new int[10];
		
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println(arr.length);
		
		Array a2 = new Array(arr); //�迭�� �־ �迭�� �� a2 ������� �迭�� ����
									//������ ũ�� : arr.length == 10
		
		Array a1 = new Array(array); //��ü�� �־ ��ü���� �迭�� ������ ũ�⸸ŭ ������ ��������
									  //��ü �� �迭�� ���� ��������� ���� �迭�� ����
		
		
	}

}