package chapter13.stream;

public class Student {
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
	
}
