package com.javaex.practice;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex08
		
		int lotto[] = new int[6];
		for(int i=0; i<6; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}
		
		for(int z=0; z<lotto.length; z++) {
			for(int a=0; a<lotto.length; a++) {
				if(a==z) {continue;}
				if(lotto[z]==lotto[a]) {
					lotto[a]=(int)(Math.random()*45)+1;}
			}
			System.out.print(lotto[z]+"  ");
		}
	}
}
