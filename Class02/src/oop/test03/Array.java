package oop.test03;


public class Array {
	//Array��� Ŭ������ �����Ͽ� ���� �����Ͱ� ����ǵ��� ����
	
	//	(�����׸�)�迭, length(�迭 �������� ����), size
	private int[] arr;
	private int length;//�� �����Ͱ���
	private int size; //�迭�� ��ũ��
	
	public Array(int num) { //���ڸ� �޾ƿ��� ������
		arr = new int[num];	//== int[] arr = new int[num];
		this.length = 0;
		this.size = num;
	}
	
	public Array(int[] arr) { //�迭�� �޾ƿ��� ������
		arr = new int[arr.length];
		int cnt = 0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				cnt+=1;
			}
		}
		this.length = cnt;
		this.size = arr.length;
	}
	
	public Array(Array array) { //��ü�� �޾ƿ��� ������
		arr = new int[array.size];
		
		
	}
	
	//(���) 
	//add(v)	void
	//v��� �����͸� ������ ĭ�� �߰�
	//�ִ� 10��������
	//get(i)	int
	//Ư�� ��ġ�� ������ ����
	//i��° ������ ��ȯ
	//remove()	void
	//������ �����͸� ����
	//������ ������ ���� ����
	//size()	int
	//���� �������� ������ ��ȯ
	
	public void add() {
		
	}
	
	public int get(int i) {
		int k = 0;
		for (int n=0;n<arr.length;n++) {
			if (arr[i]==arr[n]) {
				k = arr[i];		
			}
		}
		return k;
		
	}
	
	public void remove() {
		this.arr[arr.length-1] = 0;
		this.length = 
		this.size = size;
	}
	
	public int size() {
		this.size = arr.length;
		return size;
	}
}

