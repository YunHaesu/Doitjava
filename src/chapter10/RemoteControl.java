package chapter10;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �⺻ �޼ҵ�
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);
	
	// �ʿ信 ���� default ��밡��
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���Ұ� ���·� �����մϴ�");
		} else {
			System.out.println("���Ұ� ���¸� ��ü�մϴ�.");
		}
	}
	
	static void changeBattery(){
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
