package _20230608.interfaces;

public class SmartTelevision implements RemoteControl, Searchable{
	int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "SEARCH.");
	}

	@Override
	public void turnOn() {
		System.out.println("Smart TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV OFF");
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
