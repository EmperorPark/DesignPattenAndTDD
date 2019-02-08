package SystemHW;

public class SystemSpeaker {
	static private SystemSpeaker speaker;
	private int volume;
	
	private SystemSpeaker() {
		volume = 5;
	}
	
	public static SystemSpeaker getInstance() {
		if(speaker == null) {
			//hw access
			System.out.println("new instance");
			speaker = new SystemSpeaker();
		} else {
			System.out.println("already instance created");
		}
		return speaker;
	}
	
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
