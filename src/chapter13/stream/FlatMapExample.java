package chapter13.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList = Arrays.asList("java8 lambda", "stream mapping");
		inputList.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
		System.out.println();
		List<String> inpuList2 = Arrays.asList("10,20,30", "40,50,60");
		inpuList2.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim()); //trim 공백제거
			}
			return Arrays.stream(intArr);
		}).forEach(number -> System.out.println(number));
	}
}
