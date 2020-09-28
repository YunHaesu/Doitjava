package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AsDoubleStreamAdnBoxedExample {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		IntStream intStream = IntStream.of(intArray); // ��ȯ�ϴ� ��Ʈ���� ���� �ٲ�����Ѵ�.
		intStream.asDoubleStream().forEach(d -> System.out.println(d));

		System.out.println();
		intStream = Arrays.stream(intArray);
		Stream<Integer> temp = intStream.boxed();
		temp.forEach(obj -> System.out.println(obj.intValue()));
	}

}
