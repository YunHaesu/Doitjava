package chapter05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	/* ������ - ��ü�� ������ �� �����ϴ� ��� */
	Student(int num) { // �Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�." + num);
	} // ����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������

//	Student() {}	//����Ʈ ������ : �����ڸ� ������� ������ �ڵ����� ����
	
	Student() { // �Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�.");
	}
	Student(long num) { // �Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�." + num);
	}
	Student(int num,long num2) {
		System.out.println("Student ��ü�� �����մϴ�." + num);
	}
	Student(int num2,int num3) {
		System.out.println("Student ��ü�� �����մϴ�." );
	}
	public void showStudentInfo() { // �ڿ� �Ұ�ȣ�� ������ �޼��� ������ Ŭ����
		System.out.println(studentName + ", " + address);
	}
}
