package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		double sum=0;
		
		for(int i=0; i<5; i++) {
			double num = sc.nextDouble();
			sum=sum+num;
		}		
		System.out.println("평균은 "+(sum/5)+" 입니다.");
		배열을 안썼네..
		*/
		
		double d[] = new double[5];
		double sum=0;
		
		for(int i=0; i<d.length; i++) {
			double num = sc.nextDouble();
			d[i] = num;
			sum = sum+d[i];
		}		
		System.out.println("평균은 "+(sum/d.length)+" 입니다.");
		
		sc.close();
	}

}
