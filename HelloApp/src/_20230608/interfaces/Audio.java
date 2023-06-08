package _20230608.interfaces;

public class Audio implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio OFF");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("Audio Volume: " + this.volume);
	}

}
