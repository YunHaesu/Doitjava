package chapter04;

/*
 * ��Ʈ���������� ����
 * 1. �����̰� �α��� 100�� �̻�
 * ���ڰ� 50�� �̻�
 * 1, 2 �� �ϳ��� �����ϸ� ��Ʈ�� ������*/

public class MetroCity {
	public static void main(String[] args) {
		boolean isCapital = false;
		int citizens = 0;
		int riches = 0;
		boolean isMetro = false;

		System.out.println("���� ���ô� ��Ʈ���������Դϱ�?");
		isCapital = false;
		riches = 80;
		citizens = 150;

//		if (isCapital >= 100) {
//			if (citizens >= 100) {
//				isMetro = true;
//			} else if (riches >= 50) {
//				isMetro = true;
//			}
//		} else {
//			if (riches >= 50) {
//				isMetro = true;
//			} else {
//				isMetro = false;
//			}
//		}
		
//		if (isCapital && citizens >= 100) {
//			isMetro = true;
//		} else if (riches >= 50) {
//			isMetro = true;
//		} else {
//			isMetro = false;
//		}
		
		isMetro = (isCapital && citizens >= 100) || (riches >= 50) ? true : false;

		System.out.println("�������� : " + isCapital);
		System.out.println("�α��� : " + citizens + "����");
		System.out.println("���ڼ� : " + riches + "����");
		System.out.println(isMetro ? "��Ʈ���������Դϴ�." : "��Ʈ���������� �ƴմϴ�.");

	}

}
