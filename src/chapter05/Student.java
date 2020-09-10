package chapter05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	/* 생성자 - 객체를 생성할 때 실행하는 블록 */
	Student(int num) { // 매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다." + num);
	} // 디폴트 생성자는 매개변수가 없고 실행 코드가 없는 생성자

//	Student() {}	//디폴트 생성자 : 생성자를 명시하지 않으면 자동으로 생성
	
	Student() { // 매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다.");
	}
	Student(long num) { // 매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다." + num);
	}
	Student(int num,long num2) {
		System.out.println("Student 객체를 생성합니다." + num);
	}
	Student(int num2,int num3) {
		System.out.println("Student 객체를 생성합니다." );
	}
	public void showStudentInfo() { // 뒤에 소괄호가 있으면 메서드 없으면 클래스
		System.out.println(studentName + ", " + address);
	}
}
