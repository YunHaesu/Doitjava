package example;

import java.util.Scanner;

public class HignLow {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������ �Է����ּ���");
			System.out.print("> ");
			int num2 = sc.nextInt();
			if (num2 > num) {
				System.out.println("down");
				cnt++;
				System.out.println(cnt + "ȸ �Է�");
			} else if (num2 < num) {
				System.out.println("up");
				cnt++;
				System.out.println(cnt + "ȸ �Է�");
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("������ " + num + "�̸�" + cnt + " ȸ �Է��ϼ̽��ϴ�.");
				break;
			}

		}
	}

}
