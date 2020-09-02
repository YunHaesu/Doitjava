package example;

import java.util.Scanner;

public class Game04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 출력하세요.
		 * 
		 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		 * (1은 소수가 아닙니다)
		 * 
		 * 제한조건
		 * n은 2이상 1_000_000이하의 자연수입니다.
		 * 입출력 예
		 * n    result
		 * 10     4
		 * 5      3
		 * 입출력 예 설명
		 * 입출력 예 #1
		 * 1부터 10사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
		 * 
		 * 입출력 예 #2
		 * 1부터 5사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
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
		System.out.println("입력한 숫자의 소수의 개수는 " + cnt + "개 입니다.");
		sc.close();
		
	}

}
