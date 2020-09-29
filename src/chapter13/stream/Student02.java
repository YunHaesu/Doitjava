package chapter13.stream;

public class Student02 {
	public enum Sex {MALE,FEMALE};	// <- 상수 이기 때문에 대문자로 표기해야함.
	public enum City {Seoul,Pusan};	// <- 상수 이기 때문에 대문자로 표기해야함.
	// enum enumeration의 준말 enum은 상수여야 한다.
	
	private String name;
	private int score;
	private Sex sex;
	private City city;
	
	public Student02(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	
	public Student02(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}
	
	
}
