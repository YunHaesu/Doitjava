package example;

import java.util.Scanner;

public class Game04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ����ϼ���.
		 * 
		 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
		 * (1�� �Ҽ��� �ƴմϴ�)
		 * 
		 * ��������
		 * n�� 2�̻� 1_000_000������ �ڿ����Դϴ�.
		 * ����� ��
		 * n    result
		 * 10     4
		 * 5      3
		 * ����� �� ����
		 * ����� �� #1
		 * 1���� 10������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ
		 * 
		 * ����� �� #2
		 * 1���� 5������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 2; i <= n ; i++) {
			cnt++;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println("�Է��� ������ �Ҽ��� ������ " + cnt + "�� �Դϴ�.");
		sc.close();
		
	}

}
