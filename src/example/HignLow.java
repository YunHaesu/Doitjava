package example;

import java.util.Scanner;

public class HignLow {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수를 입력해주세요");
			System.out.print("> ");
			int num2 = sc.nextInt();
			if (num2 > num) {
				System.out.println("down");
				cnt++;
				System.out.println(cnt + "회 입력");
			} else if (num2 < num) {
				System.out.println("up");
				cnt++;
				System.out.println(cnt + "회 입력");
			} else {
				System.out.println("정답입니다.");
				System.out.println("정답은 " + num + "이며" + cnt + " 회 입력하셨습니다.");
				break;
			}

		}
	}

}
