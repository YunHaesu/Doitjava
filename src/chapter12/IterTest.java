package chapter12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50); // asList ������ ArrayList�� �߰� ������ �� �� ����.
		System.out.println(list.size());
		Iterator<Integer> ir = list.iterator();
		// �Ѱ��� if �������� while
		System.out.println("���ͷ�����");
		while (ir.hasNext()) {
			int number = ir.next();
			System.out.println(number);
		} // <- ����Ʈ�� ���������� �ʴ´�. ������ ���� ����
		System.out.println("for��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("����for��");
		for (int num : list) {
			System.out.println(num);
		}

	}
}
