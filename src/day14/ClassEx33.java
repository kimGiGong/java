package day14;		// 익명클래스

class Person{
	void wake(){
		System.out.println("7시 기상");
	}
}
class Anony{
	
	Person p2 = new Person();
	
	//	1. 변수의 초기값 대입
	Person p = new Person() {
		void work() {
			System.out.println("출근................");
		}
		@Override
		void wake() {
			System.out.println("6시 기상!!");
			work();
		}
	};
	
	//	2. 지역변수의 초기값 대입
	void func() {
		
		Person localP = new Person() {
			void walk () {
				System.out.println("산책......");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어난다....");
				walk();
			}
		};
		localP.wake();
		
	}
	void func2(Person person) {
		person.wake();
		
	}
	
	
	
}

public class ClassEx33 {

	public static void main(String[] args) {
		
		Anony anony = new Anony();
//		anony.p.wake();
//		anony.func();
		
		// 3. 매개변수의 매개값
		anony.func2(new Person() {
			void study() {
				System.out.println("공부하다..............");
			}
			@Override
			void wake() {
				System.out.println("7:30에 기상");
				study();
			}
		});
	}

}
