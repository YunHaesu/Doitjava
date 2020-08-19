package chapter04;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력 해주십시오 : ");
		int thisMon = sc.nextInt();
		System.out.println(thisMon + "월의 마지막 일자는 몇 일인가요?");
		switch (thisMon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(thisMon + "월은 31일 까지입니다.");
			break;
		case 2:
			System.out.println(thisMon + "월은 28일 까지입니다.");
			break;
		default :
			System.out.println(thisMon + "월은 30일 까지입니다.");
			break;
		}

	}

}
