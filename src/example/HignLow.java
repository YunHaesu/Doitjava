package example;

import java.util.Scanner;

public class HignLow {

	public static void main(String[] args) {
//		int num = (int) (Math.random() * 100) + 1;
//		while (true) {
//			System.out.println("������ �Է����ּ���");
//			System.out.print("> ");
//			int num2 = sc.nextInt();
//			if (num2 > num) {
//				System.out.println("down");
//				cnt++;
//				System.out.println(cnt + "ȸ �Է�");
//			} else if (num2 < num) {
//				System.out.println("up");
//				cnt++;
//				System.out.println(cnt + "ȸ �Է�");
//			} else {
//				System.out.println("�����Դϴ�.");
//				System.out.println("������ " + num + "�̸�" + cnt + " ȸ �Է��ϼ̽��ϴ�.");
//				break;
//			}
//
//		}
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int com = (int) (Math.random() * 100) + 1;
		int user = 0;

		System.out.println("���� ���߱� ������ �����մϴ�");
		System.out.println("1~100 �߿� �����ϰ� ������ ���ڸ� ���� �ּ���.");
		System.out.print(">");

		while (true) {

			user = sc.nextInt();
			System.out.println((++cnt) + " ȸ �Է��ϼ̽��ϴ�.");
			if (user > com) {

				System.out.println("�Է��Ͻ� ���ں��� �Ʒ��� �ֽ��ϴ�.(Down!)");

			} else if (user > com) {
				System.out.println("�Է��Ͻ� ���ں��� ���� �ֽ��ϴ�.(Up!)");

			} else {
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				sc.close();
				break;
			}
		}

	}

}
