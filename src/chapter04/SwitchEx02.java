package chapter04;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ð��� �Է��� �ֽʽÿ� : ");
		int now = sc.nextInt();
		
		
		System.out.println("���� �ð��� " + now +"�� �Դϴ�.");
		System.out.println("���� ������ ������ �����ϴ�.");
		
		switch (now) {
		case 9:
			System.out.println("9�ÿ��� ����� �մϴ�.");
		case 10:
			System.out.println("10�ÿ��� ��ħ��ȸ�� �մϴ�.");
		case 11:
			System.out.println("11�ÿ��� ���������� �����մϴ�.");
		case 12:
			System.out.println("12�ÿ��� ������ �Խ��ϴ�.");

		}
		
		String pos = "�븮";
		
		switch (pos) {
		case "����":
			System.out.println("������ ������ 400���� �Դϴ�.");			
			break;
		case "����":
			System.out.println("������ ������ 300���� �Դϴ�.");			
			break;
		case "�븮":
			System.out.println("�븮�� ������ 200���� �Դϴ�.");			

		default:
			System.out.println("�Ϲݻ���� ������ 150�����Դϴ�.");
		}

	}

}
