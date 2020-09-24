package chapter13;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // 메서드에서 호출할때 final로 자동으로 바뀌게 된다.
		int num = 100; // 지역 변수

		class MyRunnalbe implements Runnable { // 지역 내부 클래스
			int localNum = 10; // 지역 내부 클래스의 인스턴스 변수

			@Override
			public void run() {
				// num = 200;
				// i = 100;

				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + sNum + "(외부 클래스 정적 변수)");

			}
		}
		return new MyRunnalbe();
	}
}

public class LocallnnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10); // 메서드 호출
		runner.run();
	}
}
