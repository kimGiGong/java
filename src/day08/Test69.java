package day08;

class TheJoeunStudent{
	String name;
	String color;
	
}

class MobilePhone{
	double width;
	double height;
	double thickness;
	String color;
	String brand;
}


class MyCard{
	
//	MyCard num = new MyCard();			// 내클래스 내타입 객체생성 X
	int num;
	int num() {
		int a = ((int) (Math.random()*10))+1;
		return a;
	}
	
//	MyCard isBonus = new MyCard();		// 내클래스 내타입 객체생성 X
	boolean isBonus;
	boolean isBonus(int a) {
		int b =((int)(Math.random()*10))+1;
		boolean c;
		if (a==b) {
			c= true;
			return c;
		}else {
			c=false;
			return c;
		}
	}
	
}

class Student {
	String []studentName= new String[0];
	void studentName() {
		for (int i = 0 ; i<studentName.length;i++) {
			System.out.print(studentName[i]+"\t");
		}
		System.out.println();
	}
	int studentAge[]= new int[0];
	void studentAge() {
		for (int i = 0 ; i<studentAge.length;i++) {
			System.out.print(studentAge[i]+"\t");
		}
		System.out.println();
	}
	void student(String a,int b){
		String [] xx = new String[studentName.length+1];
		int [] yy = new int[studentAge.length+1];
		for (int i=0; i<xx.length ; i++ ) {
			if(i==(xx.length-1)) {
				xx[i]=a;
				yy[i]=b;
			}else {
			xx[i]=studentName[i];
			yy[i]=studentAge[i];
			}
		}	
		studentName=xx;
		studentAge=yy;
	}
	
	
}



public class Test69 {

	public static void main(String[] args) {
		
//		[ 객체 생성 + 변수 문제 ] 
//				1. 아래와 같은 멤버변수를 갖는 MyCard 클래스를 정의 하세요. 
//				   (MyCard 클래스는 카드 한장 만들수 있는 클래스) 
//				   - 1 ~ 10 사이 카드의 숫자(정수)를 저장할 num이라는 변수 
//				   - 카드가 보너스 카드인지 판단할 isBonus 라는 이름의 변수 (보너스카드면 true, 아니면 false저장) 
		
//				2. 1번에서 만들 MyCard 클래스를 이용하여 카드 한장을 만들고 
//				   해당 카드가 몇번이며, 보너스인지 아닌지 지정하고 
//				   출력해서 확인해보세요. 
				MyCard card = new MyCard();
				for (int i =0 ; i<20 ; i++) {				//	for 문은 보너스 너무 안나와 for 문으로 확인용
				int cardnum = card.num();
				boolean bonus = card.isBonus(cardnum);
				System.out.println(cardnum);
				System.out.println(bonus);
				}
				
				
//				3. 학생의 이름과 나이를 저장할 Student 클래스를 만들어보세요. 

//				4. 3번에서 만든 Student 클래스를 이용하여 학생 한명을 만들고,
//				이름과 나이를 저장한 후 출력해서 확인해 보세요. 
				Student student = new Student();
				student.student("ㅗ", 2200);
				student.student("ㄱ", 80);
				student.studentName();
				student.studentAge();
//				5. 아래와 같은 속성을 저장할 수 있는 (속성+기능=)멤버변수를 갖는 MobilePhone 클래스를 정의하세요. 
//				   - 가로사이즈 (실수 ex: 7.5) 
//				   - 세로사이즈 (실수)
//				   - 두께    (실수) 
//				   - 폰색상
//				   - 폰 브랜드 이름 

//				6. 5번에서 만든 MobilePhone 클래스를 이용하여 폰을 하나만들고, 
//				   모든 속성을 변경하고 출력해보세요. 
					
				MobilePhone phone = new MobilePhone();
				phone.width = 5.7;
				phone.height = 11.5;
				phone.thickness = 0.7;
				phone.color = "black";
				phone.brand = "iPhone";
				
				System.out.println();
				
				
//				7. 학생의 이름과 옷색상을 저장할 TheJoeunStudent 클래스를 정의하세요. 
				 
//				8. 7번에서 만든 클래스를 이용하여, 우리반 같은 분단에 앉은 학생들을 모두 만들고,
//				   각 학생에 맞는 이름과 옷색상을 저장하고, 출력해보세요. 

				TheJoeunStudent s0 = new TheJoeunStudent();
				s0.name = "ㄱ";
				s0.color = "black";
				TheJoeunStudent s1 = new TheJoeunStudent();
				s1.name = "ㄴ";
				s1.color = "red";
				TheJoeunStudent s2 = new TheJoeunStudent();
				s2.name = "ㄷ";
				s2.color = "blue";
				TheJoeunStudent s3 = new TheJoeunStudent();
				s3.name = "ㄹ";
				s3.color = "yellow";
				TheJoeunStudent s4 = new TheJoeunStudent();
				s4.name = "ㅁ";
				s4.color = "green";
				TheJoeunStudent s5 = new TheJoeunStudent();
				s5.name = "ㅂ";
				s5.color = "purple";
	}

}
