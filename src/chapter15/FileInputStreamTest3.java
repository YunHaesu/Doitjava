package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

// �Ϲ��ε��� ��������� Ȯ������ ���ϰ� �ϱ�����
// sql�� ���������� ���
public class FileInputStreamTest3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) { // auto close�� ����� �ڵ����� ������.
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {

					System.out.print((char) b);
				}
				System.out.println(": " + i + "����Ʈ ����");
			}
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("end");
	}
}
