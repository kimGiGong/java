package day12;

class A {
	A() {
		//super();
		System.out.println("생성자A");
	}
	
}
class B extends A {
	B() {
		//super();
		System.out.println("생성자B");
	}
}
class C extends B {
	C(){//super();
		System.out.println("생성자C");
	}
}

public class ClassEx04 {
	public static void main(String[] args) {
		
		C c = new C();		//	부모의 생성자가 먼저 생성된다.
	}

}
