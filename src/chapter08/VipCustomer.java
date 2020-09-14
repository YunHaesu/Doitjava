package chapter08;

public class VipCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	

	public VipCustomer(int customerId, String cusstomerName,int agentID) {
		super(customerId,cusstomerName);
		
		
		customerGrade = "VIP";
		bonsRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
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
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ��ȣ�� " + agentID + "�Դϴ�."; 
	}
	
	public int getAgentID() {
		return agentID;
	}

}
