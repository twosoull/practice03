package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		

		int max=0;
		for(int i=0; i <5; i++) {
			System.out.print("숫자: ");
			int A= sc.nextInt();
			if(A>max) {
				max=A;
			}
		}	
		System.out.println("최대값은 "+max+"입니다.");
		
	}
}

