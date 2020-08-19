package chapter04;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력해 주십시오 : ");
		int now = sc.nextInt();
		
		
		System.out.println("현재 시간은 " + now +"시 입니다.");
		System.out.println("남은 일정은 다음과 같습니다.");
		
		switch (now) {
		case 9:
			System.out.println("9시에는 출근을 합니다.");
		case 10:
			System.out.println("10시에는 아침조회를 합니다.");
		case 11:
			System.out.println("11시에는 오전업무를 시작합니다.");
		case 12:
			System.out.println("12시에는 점심을 먹습니다.");

		}
		
		String pos = "대리";
		
		switch (pos) {
		case "부장":
			System.out.println("부장의 월급은 400만원 입니다.");			
			break;
		case "과장":
			System.out.println("과장의 월급은 300만원 입니다.");			
			break;
		case "대리":
			System.out.println("대리의 월급은 200만원 입니다.");			

		default:
			System.out.println("일반사원의 월급은 150만원입니다.");
		}

	}

}
