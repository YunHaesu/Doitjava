package example;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇줄을 출력할까요? :");
		int line = sc.nextInt();
		for(int i = 0;i < line -1 ;i++) {
			for(int j = 0;j < line;j++) {
				if(j < line - i -1) {
					System.out.print(" ");
				} else {
					if(j <line - i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				
			}
			for (int j = 0; j <i; j++) {
				if(j == i -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < line*2 -1 ; i++) {
			System.out.print("*");
		}
	}

}
