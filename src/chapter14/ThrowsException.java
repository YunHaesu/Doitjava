package chapter14;

public class ThrowsException {
	public static void main(String[] args) throws Exception {	//�޼ҵ� �ڿ� �پ� Exception�� ó���Ѵ�.
		Class c = Class.forName("java.lang.String");
		System.out.println("���α׷��� �����մϴ�.");
		try {
			throw new ArithmeticException("�޼���");			// ���ܰ�ü�� ����� ������.
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
