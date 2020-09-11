package chapter08;

public class VipCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	

	public VipCustomer() {
		customerGrade = "VIP";
		bonsRatio = 0.05;
		saleRatio = 0.1;
	}

//	public int calcPrice(int price) {
//		bonusPoint += price * bonsRatio;
//		return price - (int)(price * saleRatio);
//	}
	public int getAgentID() {
		return agentID;
	}

}
