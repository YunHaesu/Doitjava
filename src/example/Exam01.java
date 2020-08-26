package example;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력해주세요.");
		System.out.print("> ");
		int num1 = sc.nextInt();

		System.out.println("두번째 정수를 입력해주세요.");
		System.out.print("> ");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("num1과 num2가 같음으로 same");
		} else {
			System.out.println("num1과 num2가 다름으로 different");
		}
		
		if (num1 == num2) System.out.println("same2");
		else System.out.println("different2");
		
		System.out.println(num1 == num2 ? "same3" : "different3");

		sc.close();

	}

}
