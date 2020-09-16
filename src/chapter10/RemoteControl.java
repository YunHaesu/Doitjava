package chapter10;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 기본 메소드
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);
	
	// 필요에 따라 default 사용가능
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 상태로 설정합니다");
		} else {
			System.out.println("음소거 상태를 해체합니다.");
		}
	}
	
	static void changeBattery(){
		System.out.println("건전지를 교환합니다.");
	}
}
