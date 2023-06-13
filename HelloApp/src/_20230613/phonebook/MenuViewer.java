package _20230613.phonebook;

import java.util.Scanner;

public class MenuViewer {
	public static Scanner scan = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("======<전화번호 관리>====== ");
		System.out.println("1.입력 2.검색 3.삭제 4.종료");
		System.out.print("선택>");
	}
}
