package _20230608.ploymorphism;

public class SonySpeaker implements Speaker {

	SonySpeaker(){
		System.out.println("SonySpeaker Object Create");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("Volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume down");
	}

}
