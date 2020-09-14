package chapter08;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonsRatio;
	
	public Customer() {
		initCustomer();
	}
	

	
	public Customer(int customerId,String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonsRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonsRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + 
				" 이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonsRatio() {
		return bonsRatio;
	}

	public void setBonsRatio(double bonsRatio) {
		this.bonsRatio = bonsRatio;
	}
	
}
