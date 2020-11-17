package com.javaex.practice03;

import java.util.Scanner;

public class Ex13 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int N = sc.nextInt();
		int result = 0;
		for(int i = 0; i<=N; i++) {
			result= result+i;
		}
		System.out.println("합계: "+result);
	}
}
