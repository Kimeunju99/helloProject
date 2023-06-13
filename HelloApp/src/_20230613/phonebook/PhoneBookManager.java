package _20230613.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager { //추가, 조회, 삭제, 종료-파일저장
	//이름 중복 -> 등록 x(SET 컬렉션)
	HashSet<PhoneInfo> infoStorage = new HashSet<>(); //file save
	File dataFile = new File("c:/temp/phonebook.txt");
	File dataStream = new File("c:/temp/phonebook.dat"); //objectStream
	private static PhoneBookManager instance; // singleton
	private PhoneBookManager(){
//		readFromFile(); //저장 정보 가져옴(set-infoStorage 초기화)
		readFromStream();
	}//singleton
	public static PhoneBookManager getInstance() { //singleton	
		if(instance == null)
			instance = new PhoneBookManager();
		return instance;
	}
	
	public void inputDate() throws MenuChoiceException{ //추가
		System.out.println("[ 전화번호 구분: (1)일반 (2)대학 (3)회사 ]");
		System.out.print("선택> ");
		int menu = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine(); //enter 처리
		
		PhoneInfo info = null;
		if(menu < INPUT_SELECT.NORMAL || menu > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(menu); //예외 생성
		}
		
		switch(menu) {
		case INPUT_SELECT.NORMAL:
			info = readFriend();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriend();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompFriend();
			break;
		}
		boolean isAdded = infoStorage.add(info); //정상등록:true, 비정상:false
		if(isAdded) {
			System.out.println("등록완료");
		}else {
			System.out.println("등록오류(이미 있습니다.)");
		}
	} //inputDate
	
	private PhoneInfo readFriend(){//inputDate-NORMAL
		System.out.print("이름> ");
		String name = MenuViewer.scan.nextLine();
		System.out.print("전화번호> ");
		String phone = MenuViewer.scan.nextLine();
	
		return new PhoneInfo(name, phone);
	}//readFriend
	
	private PhoneInfo readUnivFriend(){//inputDate-UNIV
		System.out.print("이름> ");
		String name = MenuViewer.scan.nextLine();
		System.out.print("전화번호> ");
		String phone = MenuViewer.scan.nextLine();
		System.out.print("전공> ");
		String major = MenuViewer.scan.nextLine();
		System.out.print("학년> ");
		int year = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}//readUnivFriend
	
	private PhoneInfo readCompFriend(){//inputDate-COMPANY
		System.out.print("이름> ");
		String name = MenuViewer.scan.nextLine();
		System.out.print("전화번호> ");
		String phone = MenuViewer.scan.nextLine();
		System.out.print("회사> ");
		String company = MenuViewer.scan.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}//readCompFriend
	
	public void storeToFile() { //종료
		try {
			FileWriter fw = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = infoStorage.iterator();
			while(iter.hasNext()) {
				fw.write(iter.next().toString()); //이름 연락처 / 전공 학년 / 회사
			}
			fw.flush();
			fw.close();
			System.out.println("정상 저장완료, 종료합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//storeToFile

	public void storeToStream() { //종료 //ObjectOutputStream
		try {
			OutputStream fos = new FileOutputStream(dataStream);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(infoStorage);

			oos.flush();			oos.close();
			fos.flush();			fos.close();
			System.out.println("정상 저장완료, 종료합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	} //storeToStream
	
	public void readFromFile() {//저장된 파일 불러오기
		if(!dataFile.exists()) //저장된 파일(초기값)이 없으면 되돌아감
			return;
		try { //저장된 파일이 있으면 불러옴
			FileReader fr = new FileReader(dataFile); //한 라인씩 읽을 수 없음
			BufferedReader br = new BufferedReader(fr); //한 라인씩 읽을 수 있음
			String str = "";
			PhoneInfo info = null;
			while((str = br.readLine()) != null) {
				String[] record = str.split(",");
				int kind = Integer.parseInt(record[0]);
				switch(kind) {
				case INPUT_SELECT.NORMAL:
					info =new PhoneInfo(record[1], record[2]);
					break;
				case INPUT_SELECT.UNIV:
					info =new PhoneUnivInfo(record[1], record[2], record[3], Integer.parseInt(record[4]));
					break;
				case INPUT_SELECT.COMPANY:
					info =new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				}
				infoStorage.add(info);
			}
			br.close();			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//readFromFile
	
	public void readFromStream() {//저장된 파일 불러오기 //ObjectInputStream
		if(!dataStream.exists()) //저장된 파일(초기값)이 없으면 되돌아감
			return;
		try {
			try {
				InputStream is = new FileInputStream(dataStream);
				ObjectInputStream ois = new ObjectInputStream(is);
				HashSet<PhoneInfo> info = (HashSet<PhoneInfo>)ois.readObject();
				for(PhoneInfo curr: info) {
					infoStorage.add(curr);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} //readFromStream
	
	public void deleteData() { //삭제
		System.out.print("이름> ");
		String name = MenuViewer.scan.nextLine();
		Iterator<PhoneInfo> iter = infoStorage.iterator();
		while(iter.hasNext()) {
			PhoneInfo curr = iter.next();
			if(curr.getName().equals(name)) {
				iter.remove(); //삭제
				System.out.println("삭제 완료.");
				return;
			}
		}
		System.out.println("삭제할 이름이 없습니다.");
	}//searchData
	
	public void searchData() { //검색
		System.out.print("이름> ");
		String name = MenuViewer.scan.nextLine();
		PhoneInfo info = search(name);
		if(info == null) {
			System.out.println("해당하는 이름이 없습니다.");
		}else {
			info.showPhoneInfo();			
		}
	}
	
	public PhoneInfo search(String name) {
		Iterator<PhoneInfo> iter = infoStorage.iterator();
		while(iter.hasNext()) {
			PhoneInfo info = iter.next();
			if(info.getName().equals(name)) {
				return info;
			}
		}
		return null;
	}//search
}
