package chapter10;

public class SmartTelevision implements RemoteControl, Searchable {
	int volume;

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV�� �մϴ�.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV�� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����:" + volume);

	}

}
