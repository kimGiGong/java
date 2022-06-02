package day15;

class AClass {}
public class ClassEx41 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		AClass a = new AClass();
		System.out.println(a.getClass());
		System.out.println(a.hashCode());
		System.out.println(a.toString());
		//	toString 구성
		System.out.println(a.getClass().getName() + "@" +Integer.toHexString(a.hashCode()));	
		
		
		

	}

}
