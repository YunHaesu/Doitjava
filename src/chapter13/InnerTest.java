package chapter13;

import chapter13.OutClass.InStaticClass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;

	static class InStaticClass { 				// ���� ���� Ŭ����
		int inNum = 100; 						// ���� ���� Ŭ������ �ν��Ͻ� ����
		static int sInNum = 200; 				// ���� ���� Ŭ������ ���� ����

		void inTest() {
//			num += 10;
			System.out.println("InstaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� �������)");
			System.out.println("InstaticClass sinNum = " + sInNum + "(���� Ŭ������ ���� �������)");
			System.out.println("InstaticClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}

		static void sTest() {
//			num += 10;
//			inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}

	public OutClass() {
		inClass = new InClass();

	}

	class InClass {
		int inNum = 100;
		// static int sInNum = 200;

		void inTest() {
			System.out.println("OutClass num =" + OutClass.this.num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum =" + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}
		// static void sTest(){
		// }
	}

	public void usingClass() {
		inClass.inTest();
	}

}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();
		System.out.println();
		InStaticClass sInClass = new InStaticClass();
		/*�ܺ� Ŭ����.���� Ŭ����. ������*/
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		InStaticClass.sTest();
	}
	
}
