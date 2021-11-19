package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intA = {3, 6, 9};
		int[] intB = new int[3];
		intB = intA;
		intB[0] = 20; intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		} // 20, 6, 10 : 주소를 복사했으므로 intB의 변화가 intA에 영향을 끼침
	}

}
