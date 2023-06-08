package _20230608.memo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Memo {
	private int no; //sequence
	private String date; //write time
	private String content; // content
	
	public Memo(int no, String content) {
		this.no =no;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
		this.date = sdf.format(date);
		this.content = content;
	}
	
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content =content;
	}

	public int getNo() {		return no;		}
	public String getDate() {	return date;	}
	public String getContent() {return content;	}
	
	public void setNo(int no) {	this.no = no;	}
	public void setDate(String date) {	this.date = date;	}
	public void setContent(String content) { this.content = content;	}
	
	@Override
	public String toString() {
		return "Memo [no=" +no+", date="+ date+", content="+content +"]";
	}
}
