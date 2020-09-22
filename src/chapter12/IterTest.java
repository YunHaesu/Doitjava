package chapter12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50); // asList 생성한 ArrayList는 추가 삭제를 할 수 없다.
		System.out.println(list.size());
		Iterator<Integer> ir = list.iterator();
		// 한개면 if 여러개면 while
		System.out.println("이터레이터");
		while (ir.hasNext()) {
			int number = ir.next();
			System.out.println(number);
		} // <- 리스트가 빠져나오진 않는다. 데이터 원본 유지
		System.out.println("for문");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("향상된for문");
		for (int num : list) {
			System.out.println(num);
		}

	}
}
