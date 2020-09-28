package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList( // asList로 만드는 리스트는 추가 삭제가 불가능하다.
				new Student("홍길동", 90), 
				new Student("신용권", 92)

		);
//		list.add(new Student("강호동", 95));

		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();

			System.out.println(name + "-" + score);
		});
		
		list.stream().forEach(System.out::println);
	}
}
