package _20230607.inherit;
//CellPhone + 영상시청
public class DmbCellPhone extends CellPhone {
	private int channel;
	
	public DmbCellPhone() {
		super(); //부모의 기본생성자 호출
	}
	
	public DmbCellPhone(String model, String color) {
		super(model, color); //부모의 인자2개인 생성자 호출
	}
	
	public DmbCellPhone(String model, String color,int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	public void setChannel(int channel) {this.channel = channel;}
	public int getChannel() { return this.channel;}
	
	//오버라이딩-부모의 메소드 재정의
	@Override
	public void powerOn() {System.out.println("Dmb 전원을 켭니다.");}
	@Override
	public void powerOff() {System.out.println("Dmb 전원을 끕니다.");}
	
	@Override
	public String toString() { //모든 클래스는 Object 클래스를 상속받음
		return "모델은" + this.getModel() + ", 컬러는 " +this.getColor();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
