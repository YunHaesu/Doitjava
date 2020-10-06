package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

// 일반인들이 열었을경우 확인하지 못하게 하기위해
// sql이 없던시절에 사용
public class FileInputStreamTest3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) { // auto close를 사용해 자동으로 닫힌다.
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {

					System.out.print((char) b);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("end");
	}
}
