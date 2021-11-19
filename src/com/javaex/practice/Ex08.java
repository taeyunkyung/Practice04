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
			if(lotto[y]==lotto[x]) {
				lotto[y]=(int)(Math.random()*45)+1;}
			}
			System.out.print(lotto[y]+"  ");	
		}
	}

}
