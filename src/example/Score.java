package example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է¹޾Ƽ�
 * ����� ����� ��
 * 100~ 91�� A ���
 * 90~ 81�� B���
 * 80~ 71 C���
 * ������ F ���
 * 
 * ��������� ����� ����ϼ���.
 * */
public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("���� ������ �Է��ϼ���. (0~100) :");
//		int num1 = sc.nextInt();
//
//		System.out.print("���� ������ �Է��ϼ���. (0~100) :");
//		int num2 = sc.nextInt();
//
//		System.out.print("���� ������ �Է��ϼ���. (0~100) :");
//		int num3 = sc.nextInt();
//
//		int ave = (num1 + num2 + num3) / 3;
//		char num4;
//		if (ave > 90) {
//			num4 = 'A';
//		} else if (ave > 80) {
//			num4 = 'B';
//		} else if (ave > 70) {
//			num4 = 'C';
//		} else {
//			num4 = 'D';
//		}
//		System.out.println("������ ����� " + ave + "���̸�, ������ ����� " + num4 + "�� �Դϴ�.");
		
		int kor = 0,eng = 0,mat = 0;
		System.out.println("���� ���� �Է� : ");
		kor = sc.nextInt();
		
		System.out.println("���� ���� �Է� : ");
		eng = sc.nextInt();
		
		System.out.println("���� ���� �Է� : ");
		mat = sc.nextInt();
		
		char grade = 0;
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
//		if(avg >= 91) {
//			grade = 'A';
//		}else if (avg >= 81) {
//			grade = 'B';
//		}else if (avg >= 71) {
//			grade = 'C';
//		}else {
//			grade = 'F';
//		}
		
		switch ((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;

		default:
			grade = 'F';
			break;
		}
		
		System.out.println("����� ��� ������ " + avg + "���̰� " + grade + "����Դϴ�.");
	}
}
