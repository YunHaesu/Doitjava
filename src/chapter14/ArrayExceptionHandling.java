package chapter14;

public class ArrayExceptionHandling {
	public static void main(String[] args) {

		try {
			int[] arr = new int[3];
			arr[2] = 100;
			System.out.println("정상 실행 했습니다.");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어나거나 산술연산에 문제가 발생했습니다.");
			e.printStackTrace();
		} finally { // finally는 예외가 발생하든 안하든 무조건 실행함.
			System.out.println("파이널리는 무조건 실행하는 구간입니다.");
		}
	}

}
