package chapter04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� 'q'�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("> ");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		} while(!inputString.equals("q"));
		System.out.println();
		System.out.println("���α׷� ����");
		sc.close();

	} 
	

}