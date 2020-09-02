package example;

import java.util.Scanner;

/*
 * 국어 영어 수학 점수를 입력받아서
 * 평균을 출력한 후
 * 100~ 91점 A 등급
 * 90~ 81은 B등급
 * 80~ 71 C등급
 * 나머지 F 등급
 * 
 * 평균점수와 등급을 출력하세요.
 * */
public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("국어 점수를 입력하세요. (0~100) :");
//		int num1 = sc.nextInt();
//
//		System.out.print("영어 점수를 입력하세요. (0~100) :");
//		int num2 = sc.nextInt();
//
//		System.out.print("수학 점수를 입력하세요. (0~100) :");
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
//		System.out.println("귀하의 평균은 " + ave + "점이며, 귀하의 등급은 " + num4 + "급 입니다.");
		
		int kor = 0,eng = 0,mat = 0;
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();
		
		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();
		
		System.out.println("수학 점수 입력 : ");
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
		
		System.out.println("당신의 평균 점수는 " + avg + "점이고 " + grade + "등급입니다.");
	}
}
