package chapter13;

import chapter13.A.B;
import chapter13.A.C;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		B b = a.new B();
		b.field1 = 3;
		b.method1();

		// ���� ��� Ŭ���� ��ü ����
		C c = new C();
		c.field1 = 3;
		c.method1();
		c.field2 = 3;
		C.method2();

		// ���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
