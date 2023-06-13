package _20230613.phonebook;
//PhoneInfo(이름,연락처)
//PhoneCompanyInfo(회사) : PhoneInfo
//PhoneUnivInfo(학교) : PhoneInfo
//PhoneBookManager(기능)
//MenuChoiceException(예외처리: INIT_MENU, INPUT_SELECT)
//MenuViewer(메뉴 출력)
public class PhoneBookApp {
	public static void main(String[] args) {
		PhoneBookManager app = PhoneBookManager.getInstance();
		int menu;
		
		//login
		while(true) {
			System.out.println("로그인이 필요합니다.");
			System.out.print("아이디> ");
			String id = MenuViewer.scan.nextLine();
			System.out.print("비밀번호>");
			String pw = MenuViewer.scan.nextLine();
			if(UserCheck.getInstance().loginCheck(id, pw)){
				System.out.println("로그인 성공.");
				break;
			}else {
				System.out.println("로그인 실패");
			}
		}
		
		while(true) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.scan.nextInt(); MenuViewer.scan.nextLine();
				if(menu< INIT_MENU.INPUT || menu> INIT_MENU.EXIT) {
					throw new MenuChoiceException(menu); //예외 발생
				}
				
				switch(menu) {
				case INIT_MENU.INPUT:
					app.inputDate();
					break;
				case INIT_MENU.SEARCH:
					app.searchData();
					break;
				case INIT_MENU.DELETE:
					app.deleteData();
					break;
				case INIT_MENU.EXIT:
//					app.storeToFile(); //filewriter
					app.storeToStream(); //objectoutputstream
					return;
				}
			}catch(MenuChoiceException e) {
				e.showWrongChoice();
			}
		}
	}
}
