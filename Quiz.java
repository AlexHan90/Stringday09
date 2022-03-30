package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// HashMap을 이용하여 간단한 메뉴판 만들기.
		// 메뉴등록 : 존재하는 메뉴면 존재하는 메뉴입니다.
		
		HashMap map = new HashMap();  
		Scanner sc = new Scanner(System.in);
		String menu = null;
		String price = null;
		
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println(">>> ");
			
		switch(sc.nextInt()) {
			case 1:
			System.out.print("등록하실 메뉴 입력");
			 menu = sc.next();
			 if(map.containsKey(menu)== true) {
				  System.out.println("이미등록되어있습니다");
				  continue;
			 }
			 System.out.print("등록하실 가격 입력 >>");
			  price = sc.next();
			  map.put(menu, price);
			  System.out.println("등록되었습니다.");
			  break;
			case 2:
				Iterator it = map.keySet().iterator();                       //김밥 라면  keyset은 자료형이 set인데 set은 인덱스 접근불가해서 iterator반복자를 이용할 수밖에없다. (값을 하나씩 가져와야해서)
																												//	그래서 set을이터레이터로 변환
				//if(it.hasNext()==true) {
					while(it.hasNext()==true) {
						menu = (String) it.next();
						System.out.println(menu +": " + map.get(menu));
					}
					
				//}else {
				//	System.out.println("등록한 메뉴가 없습니다.");
				//	continue;
				//}
				System.out.println("-------------------------------");
				System.out.println("1.수정 | 2.삭제 | 3.나가기");
				System.out.println(">>>");
				
				switch (sc.nextInt()) {
				case 1:
					System.out.println("현재 등록 되어있는 메뉴는" + map.keySet()+ "입니다.");
					System.out.print("수정하실 메뉴 입력: ");
					menu =  sc.next();
					if(map.containsKey(menu) == false) {
						System.out.println("해당 메뉴가 없습니다.");
					}else {
						map.remove(menu);
						System.out.println("삭제되었습니다.");
						continue;
						
						
					}
					defalut:
						System.out.println("이전으로 돌아갑니다.");
					continue;
				}
			case 3:
				System.out.println("프로그램 종료!!");
				System.exit(0);
				break;
			
	

}
	}

}
}

