package array;

public class Test03 {

	public static void main(String[] args) {
//		�ֻ����� 10�� ���� ����� �����Ϸ��� �Ѵ�
//		�迭�� �̿��Ͽ� ������ �����Ͻð� �Ʒ��� ����� ����ض�
//		[1] ��ü �ֻ��� ����� ���
//		[2] ¦�� �ֻ��� ����� ���
//		[3] �ֻ��� ������ �հ� ���
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = 1+(int)(Math.random()*6);
			if (i==9) {
				System.out.println(arr[i]);
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(i+1+"��°:"+arr[i]);
			}
		}

		int sum = 0;
		for(int i=0;i<5;i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
