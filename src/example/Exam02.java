package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� :");
		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		System.out.println((num1 % 2 == 0) ? "¦��2" : "Ȧ��2");

		sc.close();

	}

}
