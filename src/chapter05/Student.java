package chapter05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfo() {		// 뒤에 소괄호가 있으면 메서드 없으면 클래스
		System.out.println(studentName + ", " + address);
	}
}
