package homework;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		ItemList list = new ItemList();
		int count = 0;
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		
		while(run) {
			// 1) 메뉴는 다음과 같이  1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
			System.out.println("=========================================================");
			System.out.println("메뉴|| 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=========================================================");
			System.out.print("선택> ");
			int select = scan.nextInt();
			
			if(select == 1) {
				System.out.print("등록할 상품 수> ");
				count = scan.nextInt();
				list.setList(count);
				System.out.println("완료.");			
			}else if(select == 2) {
				String name ="";
				int pri =0;
				System.out.println("상품" + list.getList().length + "개 등록 가능");
				// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
				for(int i=0; i<list.getList().length;i++) {
					System.out.printf("등록할 상품명> ");
					name = scan.next();
					System.out.printf("상품가격> ");
					pri = scan.nextInt();
					list.setItem(i, name, pri);
				}
					
			
			}else if(select ==3) {
				// 3) 제품별 가격을 출력하세요.
				for(Item i: list.getList())
					System.out.println("상품명: "+i.label +", 가격: "+ i.price);
			}else if(select ==4) {
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				//	출력예시, "상품명 : 가격"
				int max = 0, sum = 0;
				String m = "";
				for(int i=0;i<list.getList().length;i++) {
					if(max<list.getList()[i].price) {
						max = list.getList()[i].price;
						m = list.getList()[i].label;
					}	
				}
				for(int i=0;i<list.getList().length;i++) {
					if(!m.equals(list.getList()[i].label))
						sum += list.getList()[i].price;
				}
				System.out.println("최고 가격 제품:"+ m +":" + max + ", 그 외 제품의 가격합:"+ sum);
			}else if(select ==5) {
				run = false;
			}else {
				System.out.println("1~5 사이 숫자만 입력 가능합니다.");
			}
			
		}
		
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		System.out.println("프로그램 종료.");
		scan.close();
		

	}
	
	static class Item{
		String label;
		int price;
		
		Item(String label, int price){
			this.label = label;
			this.price = price;
		}
	}
	
	static class ItemList{
		Item[] list;
		int count;
		
		public void setList(int count) {
			this.count = count;
			list = new Item[this.count];
		}
		
		public void setItem(int i, String l, int p) {
				list[i] = new Item(l,p);
		}

		public Item[] getList() {
			return list;
		}
	}
	
}
