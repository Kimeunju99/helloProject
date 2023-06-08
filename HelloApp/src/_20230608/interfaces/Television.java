package _20230608.interfaces;

public class Television implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV OFF");
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
