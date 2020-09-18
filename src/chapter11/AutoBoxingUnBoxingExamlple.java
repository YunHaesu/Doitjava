package chapter11;

public class AutoBoxingUnBoxingExamlple {

	public static void main(String[] args) {
		//ÀÚµ¿ Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		int value = obj;
		System.out.println("value : " + value);
		
		int result = obj + 100;
		System.out.println("result : " + result);
		
	}

}
