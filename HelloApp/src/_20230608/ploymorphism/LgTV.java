package _20230608.ploymorphism;

public class LgTV implements TV{
	private Speaker speaker;
	
	LgTV(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV power On");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV power Off");
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
