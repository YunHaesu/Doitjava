package example;

import java.util.Scanner;

public class Game03 {

	public static void main(String[] args) {
		// ���� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//		switch case ������ ����ؾ��մϴ�.
//		System.out.println("(1~12)���� �Է����ֽʽÿ�. ");
//		System.out.print(">");
//		int month = sc.nextInt();
//		int day = 0;
//		switch (month) {
//		case 2:
//			day = 28;
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			day = 30;
//			break;
//		default:
//			day = 31;
//			break;
//		}
//		System.out.println(month + "���� ������ ���� " + day + "�� �Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ ������ ���ڸ� �˰� �����Ű���?");
		int month = sc.nextInt();
		int day = 0;
		switch (month) {
			case 2:
				day = 28;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			
				day = 31;
				break;
			
			default:
				day = 30;
				break;
		}
		System.out.println(month + "���� ������ ���ڴ� " + day + "�� �Դϴ�.");
		sc.close();
	}

}
