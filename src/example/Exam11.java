package example;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 7 ; i++) {
//			for(int j = 0; j < i; j++) {
//					System.out.print("$");
//				
//			}
//			System.out.println();
//		}
//		for(int i = 0; i <= 7 ; i++) {
//			for(int j = 6; j > i; j--) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}
		int line;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("몇 줄을 출력하시겠습니까?(홀수만 입력) : ");
		line = sc.nextInt();
		} while (line % 2 == 0);
		
		int upLine = line/2;
		int downLine = line - upLine;
		
		for(int i = 0; i < upLine; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i = downLine-1; i>=0; i--) {
			for(int j =0; j<= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
