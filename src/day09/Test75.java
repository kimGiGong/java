package day09;

//	1.	아래와 같은 클래스를 만들고,
//		class Ex01{
//			String str = "hello java";
//			int year = 2022;
//		}
//		str 변수값을 출력하는 인스턴스 메소드 1개
//		year 변수값을 출력하는 인스턴스 메소드 1개
//		총 두개의 메소드를 추가해보세요.
//	2.	1번에서 만들 Ex01 클래스로 객체생성 2개하고 각각 메소드를 호출해보세요.
class Ex01{
	String str = "hello java";
	int year = 2022;
	void strs() {
		System.out.println(str);
	}
	void years() {
		System.out.println(year);
	}
}
//	3. 아래와 같은 클래스를 만들고,
//		class Ex02 {
//			int a;
//			boolean isPlay;
//			double d;
//		}
//		Ex02 클래스 안에 변수에 해당하는 메소드를 총 3개만든다.
//		각 메소드는 외부로 부터 데이터를 전달받아, 변수에 대입하는 처리를 한다.
	
//	4. 3번에서만든 Ex02 클래스로 객체생성 한개 하고 
//   		메서드들을 호출하여 변수에 값대입시키고, 출력해서 확인해보세요. 
class Ex02 {
	int a;
	boolean isPlay;
	double d;
	
	void asd (int b) {
		a = b;
	}
	void sdf (boolean c) {
		 isPlay = c;
	}
	void dfg (double e) {
		d = e;
	}
}   

//	5. 모바일 폰 클래스 만들기 
//	   MobPhone 클래스를 만들고, 
//	   브랜드 이름, 폰의 가로크기, 세로크기, 무게를 저장할 변수를 만드세요. 
//	   그리고, 전화걸기, 전화받기, 문자 보내기, 문자받기 메서드도 추가하세요. 
//	   (메서드 안에는 실행되었는지 확인하기 위해 단순히 출력문 하나만 작성) 
//	6. 5번에서 만든 MobPhone을 이용하여 폰을 하나 생성하고, 
//	   폰의 모든값을 출력하고, 값도 변경한후, 다시 출력해서 확인해보세요. 
//	7. 위 모바일 폰 클래스에 만들어둔 메서드중 전화걸기 메서드를 수정하세요. 
//	   전화걸기 메서드에 전화번호를 던져주면 (예: "010-1111-2222") 
//	   메서드에서는 해당 전화번호로 전화를 걸고 있다는 출력문 작성. 
//	   (출력예: 010-1111-2222로 전화를 걸고 있습니다.)
	class MobiPhone {
		String name="sam";
		int width=2;
		int depth=1;
		int height=5;
		int weight=100;
		void callOut(){
			System.out.println("전화 걸기");
		}
		void callReseption(){
			System.out.println("전화 받기");
		}
		void massageSend(){
			System.out.println("문자 전송");
		}
		void massageReseption(){
			System.out.println("문자수신");
		}
		void callOut(String a ) {
			System.out.println(a+"로 전화 걸기");
		}
	}
	
 
public class Test75 {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		ex01.strs();
		ex01.years();
		
		Ex02 ex02 = new Ex02();
		ex02.asd(6);
		ex02.sdf(true);
		ex02.dfg(555.55);
		System.out.println(ex02.a+""+ex02.isPlay+""+ex02.d);
		
		MobiPhone phone1 = new MobiPhone();
		phone1.callOut();
		phone1.callReseption();
		phone1.massageSend();
		phone1.massageReseption();
		
		
		MobiPhone phone2 = new MobiPhone();
		System.out.println(phone2.name+"\t"+phone2.width+"\t"+ phone2.depth+"\t"+ phone2.height+"\t"+phone2.weight);
		phone2.name="i";
		phone2.width=9;
		phone2.depth=8;
		phone2.height=7;
		phone2.weight=50;
		System.out.println(phone2.name+"\t"+phone2.width+"\t"+ phone2.depth+"\t"+ phone2.height+"\t"+phone2.weight);
		phone1.callOut("010-2222-4444");
		
		
		
		
//		foreach
		int [] arr = {1,2,3,4,5};
		for(int i = 0 ; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int a:arr) {
			System.out.print(a);
		}
		System.out.println();
		/*
		  	for(타입(배열과같은) 변수명(끌어낸 1개 담는변수) : 배열(=1개씩 끌어냄)){
		  		syso(변수)
		  	} 
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}