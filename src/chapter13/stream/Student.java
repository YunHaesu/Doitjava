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
	
	@Override	//Comparable 인터페이스의 추상 메소드
	public int compareTo(Student o) {
		
		return Integer.compare(score, o.score);	//매개값을 비교하여 -1,0,1 을 반환한다.
	}
	
}
