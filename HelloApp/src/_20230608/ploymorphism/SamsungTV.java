package _20230608.ploymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	
	SamsungTV(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV power On");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV power off");
	}

	@Override
	public void volumeUp() {
		this.speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		this.speaker.volumeDown();
	}

}
