package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result_k =0;
		int num = 0;
		int result_i =0;
		for(int i = 1; i<=N; i++) {
		if(i%5==0) {
			result_k += 1;
			num += 5;
			result_i = result_i+num;
		}
		}
		System.out.println("5의 배수의 개수: "+result_k);
		System.out.println("5의 배수의 합:"+ result_i);
	}
}
