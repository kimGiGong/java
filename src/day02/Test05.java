package day02;

public class Test05 {

	public static void main(String[] args) {

		char ch = '\u0041'; // unicode A
		System.out.println(ch);
		
		// 오버플로우 : 잘못된 형태
		byte b = (byte)129;
		System.out.println(b);
		
		int i = 15;			// 10진수				 		
		int j = 015;		// 8진수 : 0으로 시작하는수 
		int k = 0x15;		// 16진수: 0x 로 시작 하는수   
		int l = 0b0101;		// 2진수 : 0b 시작하는수
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		// 문자열
		String asd = "ㅎㅇ";
		asd = "ㅂㅇ";
		System.out.println(asd);
		// asd= 'A';
		asd = "A";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
