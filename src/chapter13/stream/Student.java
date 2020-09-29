package chapter13.stream;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	public Student(String name,int score) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " - " + score;
	}
	
	@Override	//Comparable �������̽��� �߻� �޼ҵ�
	public int compareTo(Student o) {
		
		return Integer.compare(score, o.score);	//�Ű����� ���Ͽ� -1,0,1 �� ��ȯ�Ѵ�.
	}
	
}