package array;

public class Test04 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// ����1) arr�迭�� 1~100�� ������ ������ �������� 5�� ����
		for(int i=0;i<arr.length;i++) {
			arr[i] = 1 + (int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// ����2) �������� ������ ��� ���
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		double avg = sum/5.0;
		System.out.println("���� : "+sum+"��");
		System.out.println("��� : "+avg+"��");		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("�հݻ� �� : "+cnt+"��");
	}

}
