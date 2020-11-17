package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int N = sc.nextInt();
		
		int result = 1;
		System.out.print(1);
		
		for(int i = 2; i<=N; i++) {
			result = result+i;
			System.out.print("+"+i);
		}
		System.out.println();
		System.out.println("합계: "+result);
	}
}
