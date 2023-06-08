package _20230607.polymorphism;

public class Tire {
	private int maxRotation;//최대 회전수(내구성)
	private int accumulatedRotation;//누적 회전수(사용량)
	private String location;//위치
	
	public Tire(String location, int maxRotation){
		this.location= location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "위치 "
					+(maxRotation-accumulatedRotation) +"회 남았습니다.");
			return true;
		}else {
			System.out.println(location+ "위치에 펑크났습니다.");
			return false;
		}
	}

	public int getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}

	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
