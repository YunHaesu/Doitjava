package chapter13;

import chapter13.A.B;
import chapter13.A.C;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// 인스턴스 멤버 클래스 객체 생성
		B b = a.new B();
		b.field1 = 3;
		b.method1();

		// 정적 멤버 클래스 객체 생성
		C c = new C();
		c.field1 = 3;
		c.method1();
		c.field2 = 3;
		C.method2();

		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
