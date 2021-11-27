package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.2, 3.3, 6.7 값을 순서대로 입력하고 6.7, 3.3, 1.2 순으로 출력하는 문제
		double[] doubleA = new double[3];
		doubleA[0] = 1.2;
		doubleA[1] = 3.3;
		doubleA[2] = 6.7;
		
		for(int i=doubleA.length-1; i>=0; i--) {
			System.out.println(doubleA[i]);
		}
	}

}
