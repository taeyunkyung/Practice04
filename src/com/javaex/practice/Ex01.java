package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i=0; i<intArray.length; i++) { // 등호를 삭제해야 배열의 크가와 맞음
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
