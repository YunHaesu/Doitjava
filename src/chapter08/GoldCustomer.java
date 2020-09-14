package chapter08;

public class GoldCustomer extends Customer{
	
	double saleRatio;
	

	public GoldCustomer(int customerId, String cusstomerName) {
		super(customerId,cusstomerName);
		
		
		customerGrade = "Gold";
		bonsRatio = 0.02;
		saleRatio = 0.1;
	}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonsRatio;
//		return price - (int)(price * saleRatio);
//	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonsRatio;
		return price - (int)(price * saleRatio);
	}
}
