package chapter13;

public class TestMyNumber {

	public static void main(String[] args) {
//		MyNumber max = (x,y) -> (x >= y) ? x:y;
//		System.out.println(max.getMax(10, 20));

		int num1 = 10;
		int num2 = 20;
		//클래스 기반의 객체 생성
		MyNumber in = new ImplNumber();
		int result = in.getMax(num1, num2);
		System.out.println("in : " + result);

		MyNumber in2 = new MyNumber() {

			@Override
			//익명 구현 객체 생성
			public int getMax(int num1, int num2) {
				// TODO Auto-generated method stub
				return (num1 >= num2) ? num1 : num2;
			}
		};
		result = in2.getMax(num1, num2);
		System.out.println("in2 : " + result);

		/* 인터페이스의 메소드가 1개 여야 사용가능. */
		// 람다식
		MyNumber in3 = (int x, int y) -> x >= y ? x : y;
		result = in3.getMax(num1, num2);
		System.out.println("in3 : " + result);
		/*만약 실행이 한줄이면 중괄호 생략*/
		/*굳이 리턴할 필요가 없다.*
		 /* 매개변숭의 자료형*/
	}

}
