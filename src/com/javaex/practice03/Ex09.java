package com.javaex.practice03;

public class Ex09 {
	public static void main(String[] args) {
		for(int i = 1; i <=10; i++) {
			for(int k =0; k<=9; k++) {
				System.out.print(i+k);
				if(i+k>9) {
				System.out.print("    ");
			}else {
				System.out.print("     ");
			}
			}
			System.out.println();
		}
	}
}
	

