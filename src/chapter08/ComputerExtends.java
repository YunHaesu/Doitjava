package chapter08;

public class ComputerExtends extends CalculatorExtends{

	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer ��ü�� areaCircle()");
		return Math.PI * r * r;
	}
	
}
