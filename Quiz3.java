package day09;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		//(1)
		// "Have a nice day Have a nice day Have a nice day" 문자열에서 a의 위치를 저장하여 출력하시오
		// 결과 : [1, 5, 13, 17, 21, 29, 33, 37, 45}
		
		String str = new String("Have a nice day Have a nice day Have a nice day");
		int i=0;
		ArrayList arr = new ArrayList();
		while(i < str.length()) {
			if(str.charAt(i) == 'a')
				arr.add(i);
			i++;
		}
		System.out.println(arr);
	}
	

	
	
	
	
	
}



