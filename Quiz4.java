package day09;

public class Quiz4 {

	public static void main(String[] args) {

		String str = new String("It is a fun java programming");

		int i=0;
		int cnt_a=0,cnt_g=0,cnt=0;
		while(i < str.length()) {
			if(str.charAt(i) == 'a')
				cnt_a++;
			else if(str.charAt(i) == 'g')
				cnt_g++;
			i++;
		}
		System.out.println("총 개수 : "+str.length());
		System.out.println("a 개수 : "+cnt_a);
		System.out.println("g 개수 : "+cnt_g);
	    
	}

}
