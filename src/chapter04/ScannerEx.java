package chapter04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		
		Scanner sc = new Scanner(System.in); // ��ĳ�� ���� �ڵ� = ���� ������ ���� ������ ��
		
//		System.out.println("������ �Է��� �ּ���.");
//		System.out.print("> ");
//		
//		iNum = sc.nextInt();
//		System.out.println("�Է��� ���� : " + iNum);
//		System.out.println();
//		System.out.println("�Ǽ��� �Է��� �ּ���.");
//		System.out.print("> ");
//		double dNum = sc.nextDouble();
//		System.out.println("�Է��� �Ǽ� : " + dNum);
//		System.out.println();
//		System.out.println("�Ǽ��� �Է��� �ּ���.");
//		System.out.print("> ");
//		float fNum = sc.nextFloat();
//		System.out.println("�Է��� �Ǽ� : " + dNum);
//		System.out.println();
//		System.out.println("���ڿ��� �Է��� �ּ���.");
//		System.out.print("> ");
//		String str = sc.next(); //���ڿ� �Է¿��� next() ��������� ������ ���� �� ����.
//		//��ĳ�ʿ��� ������ ������ �Է��� �ǹ��մϴ�.
//		System.out.println("�Է��� ���ڿ� : " + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ� : " + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ� : " + str);
		System.out.println("���ڿ��� �Է��� �ּ���.");
		String str1 = sc.nextLine(); //���� �Է� ��ɾ�� ���鵵 �Է� �����մϴ�.
		System.out.println("�Է��� ���ڿ� : " + str1);
		
		sc.close(); // ��ĳ�ʴ� �� �̻� ������� �ʴ´ٸ� �ݾ���� �մϴ�.
		

	}

}
