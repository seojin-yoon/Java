package oop.test03;


public class Array {
	//Array라는 클래스를 구현하여 숫자 데이터가 저장되도록 구현
	
	//	(구성항목)배열, length(배열 데이터의 개수), size
	private int[] arr;
	private int length;//현 데이터개수
	private int size; //배열의 총크기
	
	public Array(int num) { //숫자를 받아오는 생성자
		arr = new int[num];	//== int[] arr = new int[num];
		this.length = 0;
		this.size = num;
	}
	
	public Array(int[] arr) { //배열을 받아오는 생성자
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
	
	public Array(Array array) { //객체를 받아오는 생성자
		arr = new int[array.size];
		
		
	}
	
	//(기능) 
	//add(v)	void
	//v라는 데이터를 마지막 칸에 추가
	//최대 10개까지만
	//get(i)	int
	//특정 위치의 데이터 추출
	//i번째 데이터 반환
	//remove()	void
	//마지막 데이터를 삭제
	//데이터 없으면 실행 중지
	//size()	int
	//현재 데이터의 개수를 반환
	
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

