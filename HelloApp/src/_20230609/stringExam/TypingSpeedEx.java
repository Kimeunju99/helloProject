package _20230609.stringExam;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class TypingSpeedEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//But now, technology is beginning to catch up, 
		String origin = "bringing the idea of the metaverse to reality.";
		String[] origins = origin.split(" ");
		ArrayList<String> ori = new ArrayList<String>();
		for(int i=0;i<origins.length;i++)
				ori.add(origins[i]);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		long start = System.currentTimeMillis();
		System.out.println("------------타자 연습-------------");
		while(true) {
			if(ori.size() == 0) {
				break;
			}
			for(int i=0;i<ori.size();i++) {
				System.out.printf("%s >>", ori.get(i));
				String typing = scan.next();
				if(typing.equals(ori.get(i)))
					ori.remove(i--);
			}
		}
		long finish = System.currentTimeMillis(); //밀리세컨
		long result_min = (finish - start) / (1000 * 60);
		long result_sec = ((finish - start) / 1000) % 60;
		System.out.print("기록: "+ result_min +"분 "+result_sec +"초");
		//문장 출력 >입력: unless> 문장출력>입력:,,, 문장 다 제거
		//완료: 완료 메세지(실행했던 시간)
	}
}
