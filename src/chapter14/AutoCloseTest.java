package chapter14;

import java.util.Scanner;

public class AutoCloseTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try ( // 여러개를 close 할수 있다.
				AutoCloseObj obj = new AutoCloseObj();
				Scanner sc = new Scanner(System.in);
				) {

			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 부분 입니다.");
		}

	}

}
