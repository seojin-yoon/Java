package array;

public class Test01 {

	public static void main(String[] args) {
		/* 5*5 �������� ������� �Ѵ�
		 * 1���� 25������ ���ڸ� 5X5 ũ���� �����ǿ� �������� ��ġ�Ϸ��� �Ѵ�.
		 * ��� �ڸ��� ���ڰ� �������� ��ġ�� �� �ֵ��� �ڵ带 �����Ͻÿ�.
		 *
		 *for �ݺ��� 1���� ����Ѵ�. 1�� 1~25 (�迭�� 0���� �ʱ�ȭ�Ǿ��ִٴ� �� �����ض�)
		 *�����ε��� - �����ε��� 1�� �����ε��� 1��
		 */
		
		int[][] bingo = new int[5][5];
		/*
		//2�� ���:�ε��� ����
				int[] arr2 = new int[6];
				for (int i=0;i<1000;i++) {
					int idx = (int)(Math.random()*6); //0 1 2 3 4 5
					arr2[idx]++; //���� ������ �ñ����� ������ �ε����� ������ ��.
					//1�� ���� Ƚ���� idx=0�� ����Ǳ� ������
				}
				for (int i=0;i<arr2.length;i++) {
					System.out.println(i+1+"�� ���� Ƚ�� : "+ arr[i]);
				}
		*/
		int se=0;
		int ga=0;
		for (int i=1;i<26;i++) {
			se=(int)(Math.random()*5); //0 1 2 3 4
			ga=(int)(Math.random()*5);
			if (bingo[se][ga]==0) {
				bingo[se][ga]=i;
			}
			else {
				i--;//������ �ε����� ����
				
			}
			
		}
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(bingo[i][j]+"\t");
			}
			System.out.println();
		}
		
//while���� ��쿡 continue�� �� �� �ִ� ����:
//continue�� ������ �������� ������ �ȵ�..
	}

}
