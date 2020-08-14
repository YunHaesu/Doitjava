package chapter02;

public class CastingEx {
	public static void main(String[] args) {
		int iVal = 44032;
		char cVal = (char) iVal;
		System.out.println(cVal);

		long Lval = 500;
		iVal = (int) Lval;
		System.out.println(iVal);
		System.out.println(Lval);

		double dVal = 3.14;
		iVal = (int) dVal;
		System.out.println(iVal);
		System.out.println(dVal);

		int iNum = 103029770;
		byte bNum = (byte) iNum;
		System.out.println(bNum);
	}

}
