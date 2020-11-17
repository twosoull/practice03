package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		while(true) {
		System.out.println("-----------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------");
		System.out.print("선택>");
		int num = sc.nextInt();
		
		if(num==1) {
		System.out.print("예금액>");
		int money = sc.nextInt();
		
		 result += money;
		}else if(num==2) {
			
			System.out.print("출금액>");
			int money = sc.nextInt();
			
			 result -= money;
		}else if(num==3) {
			System.out.print("잔고\n");
			System.out.println("잔고액>"+result);
			
		}else if(num==4) {
			System.out.print("프로그램종료");
			break;
		}else {
			System.out.println("다시입력해주세요");
		}
		
		
		
	}
}
}
