package day15;

public class ClassEx45 {
	public static void main(String[] args) {
		
		Integer i = new Integer(10);		//	객체생성
		Character c = new Character('c');
		Double d = new Double(3.14);
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(d);
		System.out.println(i);
		System.out.println(b);
		
		Integer ii = new Integer("10");		//	객체생성 문자열
		Double dd = new Double("3.14");
		System.out.println(ii);
		System.out.println(dd);
		
		Float f = new Float((double)3.14);
		System.out.println(f);
		
		// 객체 Integer -> int
		int ii2 = i.intValue();
		System.out.println(ii2);
		// 객체 Character -> char
		char cc2 = c.charValue();
		System.out.println(cc2);
		// 객체 Double -> double
		double dd2 = d.doubleValue();
		System.out.println(dd2);
		
		// 문자열 -> 기본형
		int num = Integer.parseInt("132");
		
		boolean bool = Boolean.parseBoolean("true");
	}
}
