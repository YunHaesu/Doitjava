package chapter13;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // �޼��忡�� ȣ���Ҷ� final�� �ڵ����� �ٲ�� �ȴ�.
		int num = 100; // ���� ����

		class MyRunnalbe implements Runnable { // ���� ���� Ŭ����
			int localNum = 10; // ���� ���� Ŭ������ �ν��Ͻ� ����

			@Override
			public void run() {
				// num = 200;
				// i = 100;

				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum = " + sNum + "(�ܺ� Ŭ���� ���� ����)");

			}
		}
		return new MyRunnalbe();
	}
}

public class LocallnnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10); // �޼��� ȣ��
		runner.run();
	}
}
