package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] wonArray = new int[10];
		wonArray[0] = 50000; 
		wonArray[1] = 10000; 
		wonArray[2] = 5000; 
		wonArray[3] = 1000; 
		wonArray[4] = 500; 
		wonArray[5] = 100; 
		wonArray[6] = 50; 
		wonArray[7] = 10;
		wonArray[8] = 5; 
		wonArray[9] = 1; 
		int[] count = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액:"); int num = sc.nextInt();
		for(int i=0; i<wonArray.length; i++) {
			// if(num-wonArray[i]>0) : 몫과 나머지를 사용하니까 이게 필요가 없구나
			count[i]=num/wonArray[i];
			num=num%wonArray[i];
			System.out.println(wonArray[i]+"원:"+count[i]+"개");
		}
		
		sc.close();
	}

}
