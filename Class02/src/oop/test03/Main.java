package oop.test03;

public class Main {

	public static void main(String[] args) {
		Array array = new Array(5); //숫자를 넣은 만큼 배열의 크기
		
		
		int[] arr = new int[10];
		
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println(arr.length);
		
		Array a2 = new Array(arr); //배열을 넣어서 배열의 값 a2 멤버변수 배열에 저장
									//공간의 크기 : arr.length == 10
		
		Array a1 = new Array(array); //객체를 넣어서 객체만의 배열의 공간의 크기만큼 공간을 만들어야함
									  //객체 안 배열에 값이 들어있으면 값도 배열에 저장
		
		
	}

}