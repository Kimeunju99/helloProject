package _20230607.polymorphism;

public class HankookTire extends Tire {

	HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation()+1);
		if(getAccumulatedRotation()<getMaxRotation()) {
			System.out.println("한국 타이어 "+getLocation()+ "위치 "
					+(getMaxRotation()-getAccumulatedRotation()) +"회 남았습니다.");
			return true;
		}else {
			System.out.println("한국 타이어 " + getLocation() + "위치 펑크.");
			return false;
		}
	}
	
}
