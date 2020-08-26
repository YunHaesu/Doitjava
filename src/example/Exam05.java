package example;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
			

		}
		System.out.println("1부터 50까지의 숫자중 3의 배수 : " + sum + " 입니다.");

	}

}
