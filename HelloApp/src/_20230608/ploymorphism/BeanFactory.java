package _20230608.ploymorphism;

public class BeanFactory {

	public Object getBean(String tv, String speaker) {
		Speaker speakerobj = null;
		if(speaker.equals("sony")) {
			speakerobj = new SonySpeaker();
		}else if(speaker.equals("apple")) {
			speakerobj = new AppleSpeaker();
		}
		
		if(tv.equals("lg")) {
			return new LgTV(speakerobj);
		}else if(tv.equals("samsung")) {
			return new SamsungTV(speakerobj);
		}
		return null;
	}
}
