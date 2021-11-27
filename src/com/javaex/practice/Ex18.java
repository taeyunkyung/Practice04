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
		
		/*
		 * 현재 입력된 방번호 i
		 * 비교대상 j: [0]부터 순서대로 검사해서 i 이전방까지 검사
		 * 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
		 * for(int j = 0; j <i; j++) {
		 * 		if (lotto[i] == lotto [j]) {
		 * 			--i;
		 * 			break;
		 * 		}
		 * }
		 */
	}
}
