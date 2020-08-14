package chapter03;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10; // 같은 타입은 한줄에 선언과 초기화를 할 수 있다.

		int c = 100, d = 200, e = 300;

		System.out.println("a++ = " + a++ + ", ++b = " + (++b)); // 헷갈린다면 괄호를 써라
		System.out.println("a = " + a + ", b = " + b);

		c++; // 100
		c++; // 101
		c++; // 102
		System.out.println(c++); // 103
		// 104
		System.out.println(c);
		++c; // 105
		System.out.println(c);
		c++; // 105
		System.out.println(c);
		++c; // 107
		System.out.println(c);
		++c; // 108
		System.out.println(c);
		++c; // 109
		System.out.println(c);
		c++; // 109
		System.out.println(c);
		System.out.println(++c); // 111

	}

}
