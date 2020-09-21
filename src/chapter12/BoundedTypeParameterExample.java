package chapter12;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
//		String str = Util01.compare("a", "b"); (x)

		int reuslt1 = Util01.compare(10, 20);
		System.out.println(reuslt1);

		int result2 = Util01.compare(4.5, 3);
		System.out.println(result2);
	}

}
