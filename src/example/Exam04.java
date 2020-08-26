package example;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
			

		}
		System.out.println("10까지의 짝수의 합은 : " + sum + " 입니다.");


	}

}
