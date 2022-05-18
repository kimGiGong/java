package day12;

class Person1 {}
class Student1 extends Person1 {
	void test(){}
}
class Teacher1 extends Person1 { }
class Professor1 extends Teacher1 { }



//	다형성 - 매개변수 다형성		*** instanceof 를 통해 상속관계를 통해 로직을 짬 ***
public class ClassEx10 {
	
	static void print(Person1 s) {
		if(s instanceof Person1) {System.out.println("Person1");}
		if(s instanceof Student1) {
			Student1 stu = (Student1)s;		// Person1 으로 받았기에 형변환후 사용가능
			stu.test();
			System.out.println("Student1");
		}
		if(s instanceof Teacher1) {System.out.println("Teacher1");}
		if(s instanceof Professor1) {System.out.println("Professor1");}
		
	}
	

	public static void main(String[] args) {
		System.out.println("new Person");
		print(new Person1());
		System.out.println("new Student -> ");
		print(new Student1());
		System.out.println("new Teacher --->");
		print(new Teacher1());
		System.out.println("new Professor --->");
		print(new Professor1());
		
	}

}
