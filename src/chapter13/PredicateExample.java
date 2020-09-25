package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student01> list = Arrays.asList( 
				new Student01("ȫ�浿", "����", 90),
				new Student01("�����", "����", 90),
				new Student01("���ڹ�", "����", 95),
				new Student01("���ѳ�", "����", 92)
			);
	
	public static double avg(Predicate<Student01> predicate) {
		int count = 0, sum = 0;
		for(Student01 student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}
	public static void main(String[] args) {
		double maleAvg = avg( t -> t.getSex().equals("����"));
		System.out.println("���� ��� ���� : " + maleAvg);
		
		double femaleAvg = avg( t -> t.getSex().equals("����"));
		System.out.println("���� ��� ���� : " + femaleAvg);
	}

}
