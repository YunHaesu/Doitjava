package chapter14;

public class ThrowsException {
	public static void main(String[] args) throws Exception {	//메소드 뒤에 붙어 Exception을 처리한다.
		Class c = Class.forName("java.lang.String");
		System.out.println("프로그램을 종료합니다.");
		try {
			throw new ArithmeticException("메세지");			// 예외객체를 만들어 던진다.
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
