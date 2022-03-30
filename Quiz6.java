package day09;

public class Quiz6 {

	public static void main(String[] args) {
		
		/* It is fun java programming 문자열에서 'a'의 개수와 'g' 개수와 총 개수를 출력하시오
		 * 총개수 : 28
		 * a 개수 : 4
		 * g 개수 : 2
		 */
		
		
			String str1 = new String("It is a fun java programming");
			
			int i = 0;
			int a = 0, g = 0;
			while(i < str1.length()) {
				if(str1.charAt(i) == 'a')
					a++;
				else if(str1.charAt(i) == 'g')
					g++;
				i++;
			}
			System.out.println("총 개수: " + str1.length());
			System.out.println("a 개수: " + a);
			System.out.println("g 개수: " + g);
			
			
			
	}

				
}				
				
