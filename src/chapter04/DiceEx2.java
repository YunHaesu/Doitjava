package chapter04;

public class DiceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice = (int) (Math.random() * 6) + 1;

		System.out.println(dice);

		if (dice <= 3) {
			switch (dice) {
			case 1:
				break;
			case 2:
				break;
			default:
				break;
			}

		} else {
			switch (dice) {
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}
		}
		System.out.println("�ֻ����� ������ " + dice + " �Դϴ�.");
	}
}
/*
 * Math.random()�� ������ 0���� ũ�ų� ���� 1 ���� ���� �� 0 <= Math.random() < 1 0 * 6 <=
 * Math.random() * 6< 1 * 6
 */
