package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.print("숫자를 입력하세요: ");
			int N = sc.nextInt();
			
			for(int i= 1; i<=N; i++) {
				for(int j=i; j<=N; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
}
