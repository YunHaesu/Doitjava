package chapter12;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
		//Arrays.toString �迭�� �ϳ��� ���ڿ��� �������.
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));

	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));

	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));

		Course<Worker> workerCourse = new Course<>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));

		Course<Student> StudentCourse = new Course<>("�л�����", 5);
		StudentCourse.add(new Student("�л�"));
		StudentCourse.add(new Student("����л�"));

		Course<HighStudent> HighStudentCourse = new Course<>("����л�����", 5);
		HighStudentCourse.add(new HighStudent(" ����л�"));

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
