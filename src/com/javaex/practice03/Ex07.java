package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int k = 1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
