package _20230608.ploymorphism;

public class TVUser {
	public static void main(String[] args) {
//		Speaker speaker = new AppleSpeaker();
//		TV tv = new SamsungTV(speaker);
//		speaker = new SonySpeaker();
//		tv = new LgTV(speaker);
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0], args[1]);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}
}
