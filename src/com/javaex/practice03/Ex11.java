package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int N = sc.nextInt();
		
		if(N==0) {
			N = sc.nextInt();
		}
		if(N%2==1) {
			int i = 1;
			int result = 1;
			while(i<N) {
				i =i+2;
				result = result + i;
			}
			System.out.println(result);
			}else if (N%2==0) {
				int i=0;
				int result = 0;
				while(i<N){
					i=i+2;
					result= result + i;
				}
				System.out.println(result);
			}
		}
		
		
	
}
