package chapter08;

public class DmbcellPhoneEx {

	public static void main(String[] args) {
		DmbcellPhone dmbCellPhone = new DmbcellPhone("�ڹ���", "����", 100);
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		System.out.println("ä��: " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿 �Դϴ�.");
		dmbCellPhone.sendVoice("�ٻڴ� ���߿� ��ȭ�ּ���.");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
	}

}
