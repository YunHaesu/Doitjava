package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Á¤¼ö ÇÏ³ª¸¦ ÀÔ·ÂÇÏ¼¼¿ä :");
		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("Â¦¼ö");
		} else {
			System.out.println("È¦¼ö");
		}

		System.out.println((num1 % 2 == 0) ? "Â¦¼ö2" : "È¦¼ö2");

		sc.close();

	}

}
