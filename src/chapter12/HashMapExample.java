package chapter12;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<>();
		
		//��ü ����
				// Ű	  ��
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);	// "ȫ�浿" Ű�� ���� ������ ���� �������� ������ ������ ��ó
		System.out.println("�� Entry �� : " + map.size());	// ����� �� Entry �� ���
		
		//��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));	//�̸�(Ű)���� ����(��)�� �˻�
		System.out.println();
		
		Set<String> KeySet = map.keySet();	//key Set ��� key���� Set���� ����
		Iterator<String> keyIterator = KeySet.iterator();	//�ݺ��ڸ� �̿��ؼ� Ű�� ���
		while(keyIterator.hasNext()) {						// ���� Map���� ��
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");	//Ű�� Map.Entry�� ����
		System.out.println("�� Entry �� : " + map.size());
		
		// ��ü�� �ϳ��� ó��
		// Entry -> Set����.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	//Map.entrySet ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {	//�ݺ��ؼ� Map.Entry�� ��� Ű�� ���� ����
			Map.Entry<String,Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " +map.size());
	}
}
