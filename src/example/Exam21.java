package example;

import java.util.Random;
import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int iIp;
//		int num = (int)(Math.random()* 3)+1;
//			
//		while(true) {
//			System.out.print("가위(0),바위(1),보(2)중 하나를 입력해 주십시오. :");
//			iIp = sc.nextInt();
//			
//			num = (int)(Math.random()* 3)+1;
//			
//			
//			
//			if(iIp >= 3) {
//				System.out.println("다시입력해주세요.");
//			} else if ((iIp == 0)&&(num ==3)) {
//				System.out.println("승리하였습니다.");
//			} else if(iIp+1 < num) {
//				System.out.println("패배하였습니다.");
//			} else if((iIp == 2)&&(num == 1)) {
//				System.out.println("패배하였습니다.");
//			} else if (iIp+1 > num) {
//				System.out.println("승리하였습니다.");
//			} else {
//				System.out.println("비겼습니다.");
//			}
//
//		}

		final int GA = 0;
		final int BA = 1;
		final int BO = 2;

		int user, com;
		int score = 0;
		int life = 3;
		System.out.println("가위바위보 게임입니다.");

		while (true) {

			com = (int) (Math.random() * 3);
			System.out.println("0: 가위, 1: 바위, 2:보");
			System.out.print(">");
			user = sc.nextInt(); // 0, 1, 2 이외의 입력을 재입력할 수 있도록 합니다.

			if (user >= 3) {
				System.out.println("재입력 해주세요.");
				continue;
			}

			/* 결과값 출력 */
			System.out.println("컴퓨터 : " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			System.out.println("유저 : " + (user == 0 ? "가위" : (user == 1 ? "바위" : "보")));
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user == GA)) {
				System.out.println("유저 승");
				score += 100;
			} else if (com == user) {
				System.out.println("비김");
				score += 10;
			} else {
				System.out.println("컴퓨터 승");
				life--;
			}

			/* 현재 남은 목숨 출력 */
			System.out.println("현재 남은 목숨 : " + life + " 현재 점수 : " + score);
			/* 목숨이 0이 되면 게임을 종료 */
			if (life <= 0) {
				System.out.println("게임종료");
				break;
			}
		}
	}

}
