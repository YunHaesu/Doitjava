package chapter13;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		int num = 10;
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);

		StringConcat concat2 = (s, v) -> 
		{	// 이 중괄호는 객체를 설명하는 공간이 아니라 + - 하는 공간 (객체생성의 공간이 아님)
//			num = 100;	
			System.out.println(num);
			System.out.println(s + ", " + v); // void는 리턴되지 않습니다.
		};
		concat2.makeString(s1, s2);

		StringConcat concat3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
//				num = 100;
				System.out.println(num);
				System.out.println(s1 + ", " + s2);
			}
		};
		concat3.makeString(s1, s2);

	}

}
