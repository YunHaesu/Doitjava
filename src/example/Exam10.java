package example;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇줄을 출력할까요? : ");
		int line = sc.nextInt();
		for(int i = 1; i <= line ; i++) {
			for(int j = 0; j < i; j++) {
				if(j % 2 == 0) {
					System.out.print("$");
				} else {
					System.out.print("\\");
				}
				
			}
			System.out.println();
		}
//		for(int i = 0; i <= line/2 ; i++) {
//			for(int j = line/2-i; j > 0; j--) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}

	}

}
