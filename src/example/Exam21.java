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
//			System.out.print("����(0),����(1),��(2)�� �ϳ��� �Է��� �ֽʽÿ�. :");
//			iIp = sc.nextInt();
//			
//			num = (int)(Math.random()* 3)+1;
//			
//			
//			
//			if(iIp >= 3) {
//				System.out.println("�ٽ��Է����ּ���.");
//			} else if ((iIp == 0)&&(num ==3)) {
//				System.out.println("�¸��Ͽ����ϴ�.");
//			} else if(iIp+1 < num) {
//				System.out.println("�й��Ͽ����ϴ�.");
//			} else if((iIp == 2)&&(num == 1)) {
//				System.out.println("�й��Ͽ����ϴ�.");
//			} else if (iIp+1 > num) {
//				System.out.println("�¸��Ͽ����ϴ�.");
//			} else {
//				System.out.println("�����ϴ�.");
//			}
//
//		}

		final int GA = 0;
		final int BA = 1;
		final int BO = 2;

		int user, com;
		int score = 0;
		int life = 3;
		System.out.println("���������� �����Դϴ�.");

		while (true) {

			com = (int) (Math.random() * 3);
			System.out.println("0: ����, 1: ����, 2:��");
			System.out.print(">");
			user = sc.nextInt(); // 0, 1, 2 �̿��� �Է��� ���Է��� �� �ֵ��� �մϴ�.

			if (user >= 3) {
				System.out.println("���Է� ���ּ���.");
				continue;
			}

			/* ����� ��� */
			System.out.println("��ǻ�� : " + (com == 0 ? "����" : (com == 1 ? "����" : "��")));
			System.out.println("���� : " + (user == 0 ? "����" : (user == 1 ? "����" : "��")));
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user == GA)) {
				System.out.println("���� ��");
				score += 100;
			} else if (com == user) {
				System.out.println("���");
				score += 10;
			} else {
				System.out.println("��ǻ�� ��");
				life--;
			}

			/* ���� ���� ��� ��� */
			System.out.println("���� ���� ��� : " + life + " ���� ���� : " + score);
			/* ����� 0�� �Ǹ� ������ ���� */
			if (life <= 0) {
				System.out.println("��������");
				break;
			}
		}
	}

}
