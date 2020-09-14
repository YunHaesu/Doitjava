package chapter08;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerId(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VipCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println();
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		System.out.println();
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + " ���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		System.out.println(customerKim.getCustomerName() + " ���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerKim.showCustomerInfo());
	}

}
