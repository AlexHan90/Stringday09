package day09;

public class Quiz10 {

	public static void main(String[] args) {
		  String str = new String("tESt  sTring  change   first");
	      String changeStr = new String();
	      int i=0;

	      str = str.toLowerCase();
	      if(str.charAt(0) >='a' && str.charAt(0) <='z') {
	         changeStr+=(char)(str.charAt(i)-32);
	         i++;
	      }
	      // str =         test  string  change   first
	      // changeStr =   Test  String  Change
	      while(i<str.length()) {
	         if(str.charAt(i)==' '&&str.charAt(i+1)!=' ') {
	            changeStr+=str.charAt(i);
	            i++;
	            changeStr+=(char)(str.charAt(i)-32);
	         }
	         else {
	            changeStr+=str.charAt(i);
	         }
	         i++;
	      }
	      System.out.println(str);
	      System.out.println(changeStr);
	      System.out.println("종료");


	}

}
