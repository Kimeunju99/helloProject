package _20230613.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

class User{
	String id;
	String pw;
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}

public class UserCheck {
	HashSet<User> userlist = new HashSet<>();
	
	private static UserCheck user = new UserCheck();
	public static UserCheck getInstance() {	return user; }

	private UserCheck(){
		readFromFile();
	}
	
	public boolean loginCheck(String id, String pw) {
		for(User u : userlist) {
			if(id.equals(u.id) && pw.equals(u.pw)) {
				return true;
			}	
		}
		return false;
	}
	
	public void readFromFile() {
		try{
			FileReader is = new FileReader(new File("c:/temp/userList.txt"));
			BufferedReader br = new BufferedReader(is);
			String uinfo = "";
			while((uinfo = br.readLine()) != null) {
				String[] list = uinfo.split(" ");
				userlist.add(new User(list[0], list[1]));
			}
			br.close();
			is.close();
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
