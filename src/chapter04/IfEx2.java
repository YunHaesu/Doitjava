package chapter04;

import java.util.Scanner;


public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ֽʽÿ� : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else if(score >= 80){	// else ������ if������ false�� ��� ����Ǵ� ����
			System.out.println("������ 80���� ũ�ų� �����ϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else if(score >= 70){	// else ������ if������ false�� ��� ����Ǵ� ����
			if(score >= 75) {
				System.out.println("������ 75���� ũ�ų� �����ϴ�.");
				System.out.println("����� C+�Դϴ�.");
			}else {
				System.out.println("������ 70���� ũ�ų� �����ϴ�");
				System.out.println("����� C�Դϴ�.");
			}
		} else {
			System.out.println("����� F�Դϴ�.");
		}

		System.out.println("������ �� �Դϴ�.");

	}

}
