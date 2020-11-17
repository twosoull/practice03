package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	
		public static void main(String[] args) {
			
			System.out.println("====================");
			System.out.println("숫자맞추기게임 시작");
			System.out.println("====================");
			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.print(">>");
				int N = sc.nextInt();
				if(N<29) {
					System.out.println("더 높게");
				}else if(N>29){
					System.out.println("더 낮게");
				}else if(N==29){
					System.out.println("맞았습니다");
					System.out.print("게임을 종료하시겠습니까?(y/n) >>");
					Scanner ss = new Scanner(System.in);
					String choice = ss.nextLine();
					String y="y";
					String n="n";
					if(choice.equals("y")) {
						System.out.println("====================");
						System.out.println("숫자맞추기게임 종료");
						System.out.println("====================");
						break;
					}else if(choice.equals(n)){
						System.out.print("한판더 ㄱㄱ 숫자입력 >>");
						
						
					}
				}
				
				
			}
		}
}
