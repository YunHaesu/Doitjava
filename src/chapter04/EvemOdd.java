package chapter04;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڰ� Ȧ�� ���� ¦�� ���� ����ϼ���.
 * */
public class EvemOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է� ���ּ���.");		
		System.out.print("> ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " �� '¦��' �Դϴ�.");
		} else {
			System.out.println(num + " �� 'Ȧ��' �Դϴ�.");
		}
		sc.close();
		
		

	}

}
