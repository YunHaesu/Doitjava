package chapter08;

public class ComputerExtendsEx {

	public static void main(String[] args) {
		int r = 10;

		CalculatorExtends calc = new CalculatorExtends();
		System.out.println("원 면적 : " + calc.areaCircle(r));
		System.out.println();

		ComputerExtends com = new ComputerExtends();
		System.out.println("원 면적 : " + com.areaCircle(r));
	}

}
