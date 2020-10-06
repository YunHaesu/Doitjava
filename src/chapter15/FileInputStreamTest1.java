package chapter15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileReader fis = null;
//		�Ϲ� ������ inputStream�� outputStream�� ����ؾ��Ѵ�.
//		 inputStream�� 1����Ʈ ������ ����ϱ� ������ �ѱ��� ��µ� �� ����.
//		 FileReader �� ����ؾ� �ѱ��� ���´�.

		try {
			fis = new FileReader("C:\\Users\\yn-19\\git\\Doitjava\\src\\chapter15\\input.txt");
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			int word;
			while ((word = fis.read()) != -1) {
				System.out.print((char) word);
			}
		} catch (IOException e) {
			System.out.println(e);
			// TODO: handle exception
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e2) {
				// TODO: handle exception
				System.out.println(e2);
			} catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		}
		System.out.println("end");
	}
}
