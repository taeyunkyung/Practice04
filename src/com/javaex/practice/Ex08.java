package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lotto[] = new int[6];
		for(int i=0; i<6; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}
		
		for(int y=0; y<lotto.length; y++) {	
			for(int x=y+1; x<lotto.length; x++) { 
				// 0: 12345 검사, 1: 2345 검사, 2: 345 검사...
			if(lotto[y]==lotto[x]) { 
				lotto[y]=(int)(Math.random()*45)+1;} 
			}
			// x를 새로 주든 y를 새로 주든 상관없나?
			// 검사가 끝난 값과 새로 생성한 값이 또 같아지는 경우가 생길 수 있나?
			System.out.print(lotto[y]+"  ");	
		}
	}

}
