package chapter04;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 입력받은 숫자가 홀수 인지 짝수 인지 출력하세요.
 * */
public class EvemOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력 해주세요.");		
		System.out.print("> ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " 은 '짝수' 입니다.");
		} else {
			System.out.println(num + " 은 '홀수' 입니다.");
		}
		sc.close();
		
		

	}

}
