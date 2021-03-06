package chapter12;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
		//Arrays.toString 배열을 하나의 문자열로 만들어줌.
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));

		Course<Student> StudentCourse = new Course<>("학생과정", 5);
		StudentCourse.add(new Student("학생"));
		StudentCourse.add(new Student("고등학생"));

		Course<HighStudent> HighStudentCourse = new Course<>("고등학생과정", 5);
		HighStudentCourse.add(new HighStudent(" 고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(StudentCourse);
		registerCourse(HighStudentCourse);
		System.out.println();

//			registerCourseStudent(personCourse);				(x)
//			registerCourseStudent(workerCourse);				(x)
		registerCourseStudent(StudentCourse);
		registerCourseStudent(HighStudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(StudentCourse);					(x)
//		registerCourseWorker(HighStudentCourse);				(x)
	}

}
