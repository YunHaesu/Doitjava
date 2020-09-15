package chapter09;

public class CarTest {

	public static void main(String[] args) {
	System.out.println("===자율 주행하는 자동차 ===");
	Car mycar = new AICar();
	mycar.run();
	
	System.out.println("=== 사람이 운전하는 자동차 ===");
	Car hisCar = new ManualCar();
	hisCar.run();
	}

}
