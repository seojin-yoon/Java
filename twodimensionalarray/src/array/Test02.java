package array;

public class Test02 {

	public static void main(String[] args) {
		// �迭��[�����ε���][�����ε���]
		int[][] arr = new int[3][3];
		
		//10 20 30
		//40 50 60
		//70 80 90
		
		//����1) ��ü �� ���: 450
		//����2) 4�� ����� ���: 20 40 60 80
		//����3) 4�� ����� �� ���: 200
		//����4) 4�� ����� ���� ���: 4
		
		int cnt=10;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				arr[i][j] = cnt;
				cnt+=10;
			}
			//cnt+=10; �̰Ǿƴϴ�
		}
		
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int sum=0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				sum+=arr[i][j];
			}
		}
		
		System.out.println(sum);
		
		int sum2=0;
		int cnt2=0;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (arr[i][j]%4==0) {
					System.out.print(arr[i][j]+" ");
					sum2+=arr[i][j];
					cnt2++;
				}
			}
		}
		System.out.println();
		System.out.println(sum2);
		System.out.println(cnt2);
	}

}
