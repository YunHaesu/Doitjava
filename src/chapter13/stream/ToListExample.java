package chapter13.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		List<Student02> totalList = Arrays.asList(
				new Student02("홍길동", 10, Student02.Sex.MALE),
				new Student02("김수애", 6, Student02.Sex.FEMALE), 
				new Student02("신용권", 10, Student02.Sex.MALE),
				new Student02("박수미", 6, Student02.Sex.FEMALE));

		// 남학생들만 묶어 List 생성
		List<Student02> maleList = totalList.stream().filter(s -> s.getSex() == Student02.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));

		// 여학생들만 묶어 HashSet 생성
		System.out.println();
		Set<Student02> femaleSet = totalList.stream()
//				 .collect(Collectors.toCollection(Hash :: new));
//				 .collect(Collectors.toCollection(() -> {return new HashSet<Student02>();}));
				.filter(s -> s.getSex() == Student02.Sex.FEMALE)
				.collect(Collectors.toCollection(() -> new HashSet<>()));
		femaleSet.stream().forEach(s -> System.out.println(s.getName()));
	}

}
