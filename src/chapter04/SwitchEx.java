package chapter04;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ����� �˷��ֽʽÿ�. : ");
		int ranking = sc.nextInt();
		char medalColor;

		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;

		case 3:
			medalColor = 'B';
			break;

		default:
			medalColor = 'I';

		}
		System.out.println(ranking + "�� �޴��� ������" + medalColor + "�Դϴ�.");

		if (ranking == 1) {
			medalColor = 'G';

		} else if (ranking == 2) {
			medalColor = 'S';

		} else if (ranking == 3) {
			medalColor = 'B';

		} else {
			medalColor = 'I';

		}
		System.out.println(ranking + "�� �޴��� ������" + medalColor + "�Դϴ�.");
	}

}
