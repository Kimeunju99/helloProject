package _20230608.ploymorphism;

public class AppleSpeaker implements Speaker{

	AppleSpeaker(){
		System.out.println("AppleSpeaker Object Create");
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
