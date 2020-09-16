package chapter10;

public class InterDriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterDriver driver = new InterDriver();
		
		InterBus bus = new InterBus();
		InterTaxi taxi = new InterTaxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
