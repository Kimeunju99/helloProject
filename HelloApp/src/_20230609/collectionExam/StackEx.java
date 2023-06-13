package _20230609.collectionExam;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> stacks = new Stack<>();
		
		stacks.push("사과");
		stacks.push("오렌지");
		stacks.push("딸기");
		stacks.push("배");
		System.out.println(stacks.peek()); //지우지 않고 젤 위에를 선택함
		//------------pop()----------------//지우면서 꺼냄
		while(!stacks.isEmpty()) {
//			int size = stacks.size();
//			for(int i=0;i<size; i++) {
//				System.out.println(stacks.pop()); //지우면서 꺼냄
//			}
			System.out.println(stacks.pop());
		}
		
	}
}
