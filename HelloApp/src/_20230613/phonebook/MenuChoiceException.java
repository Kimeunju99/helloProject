package _20230613.phonebook;

public class MenuChoiceException extends Exception{
	private int wrongChoice;
	MenuChoiceException(int wrongChoice){
		super("없는 메뉴번호입니다.");
		this.wrongChoice = wrongChoice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice+"는 없는 메뉴번호 입니다.");
	}
}
