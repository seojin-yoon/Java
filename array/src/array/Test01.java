package array;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		//����1) 10���� 50���� �迭�� ����
		//����1) 10 20 30 40 50
		
		int a = 10;
		for(int i=0;i<arr.length;i++) {
			arr[i] = a;
			System.out.println(arr[i]);
			a+=10;
		}
		
		//����2) ��ü �� ���
		//����2) 150
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
