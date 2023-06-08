package _20230607.inherit;

public class PhoneApp {
	public static void main(String[] args) {
		CellPhone cell = new CellPhone();
		cell.setModel("갤럭시");
		cell.setColor("흰색");
		cell.powerOn();
		cell.powerOff();
		
		DmbCellPhone dmb1 = new DmbCellPhone();
		dmb1.setModel("갤럭시2");
		dmb1.setColor("검정");
		dmb1.setChannel(100);
		dmb1.powerOn();
		dmb1.powerOff();
		
		CellPhone cell2 = new DmbCellPhone(); //promotion(자동형변환)
		cell2.setModel("갤럭시2");
		cell2.setColor("노랑");
//		cell2.setChannel(100);형변환되어 자식의 내용물 사용불가.

		if(cell2 instanceof DmbCellPhone) { //cell2가 dmb인스턴스가 맞냐(맞음)
		DmbCellPhone dmb2 = (DmbCellPhone)cell2; //casting(강제형변환)
		dmb2.setChannel(100);
		dmb2.powerOn();
		}
		if(cell instanceof DmbCellPhone) { //cell이 dmb인스턴스가 맞냐(아님)
		DmbCellPhone dmb3 = (DmbCellPhone)cell;
		dmb3.setChannel(200);
		}
		
		int num = 20;
		num = new Integer(30); //30정수의 값을 담고 있는 인스턴스.
	}
}
