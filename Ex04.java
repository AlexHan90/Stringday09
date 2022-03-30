package day09;

public class Ex04 {

	public static void main(String[] args) {
		String str;
		str = "test";
			System.out.println(str);
			
			String str2 = new String()	;			
			str2 = "test222";
			System.out.println(str2);
			
			str2 = "java is difficult . and  programming is not" ;
			System.out.println("기본 : " +str2);
			System.out.println(str2.toUpperCase());                //일시적으로 값을 변경하고 보여준다.
			System.out.println("확인: " + str2);
		
			 str2 = str2.toUpperCase(); // 변경한 값을  변수에 입력 그다음부터는 대문자로 나온다
			 
			System.out.println(str2.toLowerCase());  // 소문자
			
			str = "abcde";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(0) - 32);
			System.out.println((char)(str.charAt(0) - 32));       //아스키 코드
			System.out.println(str.charAt(1)=='b');
			System.out.println(str.charAt(1)=='c');
		
			
			
			
				
	}

}
