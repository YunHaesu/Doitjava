package chapter13.stream;

import java.util.Arrays;

public class MatchExample {

	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		//전부 match인가?
		boolean result = Arrays.stream(intArr).allMatch(a -> a%2 == 0);
		System.out.println("모두 2의 배수인가? " + result);
		//하나라도 match인가?
		result = Arrays.stream(intArr).anyMatch(a -> a%3 == 0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		//match되는게 하나도 없냐? 
		result = Arrays.stream(intArr).noneMatch(a -> a%3 ==0);
		System.out.println("3의 배수는 없는가? " + result);
	}

}
