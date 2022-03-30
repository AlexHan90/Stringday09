package day09;

public class Ex05 {

	public static void main(String[] args) {
	String id = "  test     ";
	String idChk = "test";
	System.out.println(id);
	System.out.println(idChk);
	
	
	System.out.println(id.equals(idChk));
	System.out.println(id.trim());  //trim 양쪽공백 삭제
	System.out.println(idChk.equals(id.trim()));
	
	String str = "031245 / 서울 / 종로3";
	String[] s = str.split(" / ");   //슬러쉬를 기준으로 쪼갠다
	System.out.println(s[0]);
	System.out.println(s[1]);
	System.out.println(s[2]);
	s[2] = "주소변경";
	str = s[0]+"/"+s[1]+"/"+s[2];
	
	String re = str.replace("/", ":");    //replace  치환
	System.out.println(re);
	
	
	
	
	
	
	
	}

}
