package example;

import java.util.Scanner;

public class Game03 {

	public static void main(String[] args) {
		// 달의 마지막 일자를 출력하는 프로그램을 작성하세요.
//		switch case 구문을 사용해야합니다.
//		System.out.println("(1~12)달을 입력해주십시오. ");
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
//		System.out.println(month + "월의 마지막 일은 " + day + "일 입니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월달의 마지막 일자를 알고 싶으신가요?");
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
		System.out.println(month + "월의 마지막 일자는 " + day + "일 입니다.");
		sc.close();
	}

}
