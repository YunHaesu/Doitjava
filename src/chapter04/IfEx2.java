package chapter04;

import java.util.Scanner;


public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주십시오 : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >= 80){	// else 구문은 if문에서 false일 경우 실행되는 영역
			System.out.println("점수가 80보다 크거나 같습니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70){	// else 구문은 if문에서 false일 경우 실행되는 영역
			if(score >= 75) {
				System.out.println("점수가 75보다 크거나 같습니다.");
				System.out.println("등급은 C+입니다.");
			}else {
				System.out.println("점수가 70보다 크거나 같습니다");
				System.out.println("등급은 C입니다.");
			}
		} else {
			System.out.println("등급은 F입니다.");
		}

		System.out.println("마지막 줄 입니다.");

	}

}
