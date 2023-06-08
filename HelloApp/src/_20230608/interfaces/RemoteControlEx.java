package _20230608.interfaces;

public class RemoteControlEx {
	public static void main(String[] args) {
//		Audio audio = new Audio();
//		Television remote = new Television();
//		RemoteControl audio = new Audio();
//		audio.turnOn();
//		audio.setVolume(6);
//		audio.turnOff();
				
		RemoteControl remote;
//		remote = new Television();
		remote = new Audio();
	
		remote.turnOn();
		remote.setVolume(7);
		remote.turnOff();
		
	}
}
