package example;

import java.util.Scanner;

public class HignLow {

	public static void main(String[] args) {
//		int num = (int) (Math.random() * 100) + 1;
//		while (true) {
//			System.out.println("정수를 입력해주세요");
//			System.out.print("> ");
//			int num2 = sc.nextInt();
//			if (num2 > num) {
//				System.out.println("down");
//				cnt++;
//				System.out.println(cnt + "회 입력");
//			} else if (num2 < num) {
//				System.out.println("up");
//				cnt++;
//				System.out.println(cnt + "회 입력");
//			} else {
//				System.out.println("정답입니다.");
//				System.out.println("정답은 " + num + "이며" + cnt + " 회 입력하셨습니다.");
//				break;
//			}
//
//		}
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int com = (int) (Math.random() * 100) + 1;
		int user = 0;

		System.out.println("숫자 맞추기 게임을 시작합니다");
		System.out.println("1~100 중에 랜덤하게 생성된 숫자를 맞춰 주세요.");
		System.out.print(">");

		while (true) {

			user = sc.nextInt();
			System.out.println((++cnt) + " 회 입력하셨습니다.");
			if (user > com) {

				System.out.println("입력하신 숫자보다 아래에 있습니다.(Down!)");

			} else if (user > com) {
				System.out.println("입력하신 숫자보다 위에 있습니다.(Up!)");

			} else {
				System.out.println("정답입니다. 게임을 종료합니다.");
				sc.close();
				break;
			}
		}

	}

}
