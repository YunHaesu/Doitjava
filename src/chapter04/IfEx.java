package chapter04;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ֽʽÿ� : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else {	// else ������ if������ false�� ��� ����Ǵ� ����
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
//		if (score < 90) {
//			System.out.println("������ 90���� �۽��ϴ�.");
//			System.out.println("����� B�Դϴ�.");
//		}
		System.out.println("������ �� �Դϴ�.");

	}

}
