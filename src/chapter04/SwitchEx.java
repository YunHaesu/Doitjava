package chapter04;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메달 등수를 알려주십시오. : ");
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
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");

		if (ranking == 1) {
			medalColor = 'G';

		} else if (ranking == 2) {
			medalColor = 'S';

		} else if (ranking == 3) {
			medalColor = 'B';

		} else {
			medalColor = 'I';

		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
	}

}
