package day12;
//	매개변수 다형성
class Product {
	int price;			//	제품가격
	int bonusPoint;		// 	제품 구매시 제공하는 보너스 포인트
	
	Product(int price){
		this.price =price;
		bonusPoint = (int)(price/10.0);
	}
}
class Tv extends Product {
	Tv() {
		super(100);				//자식은 무조건생성자를 만들어야함 
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer () {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer" ;
	}
}
class Buyer {	// 호갱님
	int money = 1000;	//	지갑
	int bonusPoint = 0;	//	고객소유의 보너스포인트
	
	void buy(Product p ) {	// 제품 산다~~	매개변수의 다형성
		money-= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구매하셨습니다.");		// p를 부르면 주소용 toString 자동 호출
	}
	
	
}	








public class ClassEx11 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
	//	System.out.println(tv);
//		참조변수 출력하면 참조변수의 toString() 메소드가 호출되서
//		메소드가 돌려주는 값을 출력하게 된다.
//		출력형태가 마음에 안들면 Object로 부터 물려받은
//		toString() 메소드를 Override 해서 원하는 문자열을 리턴해주게 변경하면된다.
//		나 또는 부모가 Override을 안했으면 Object 클래스가 만들어놓은 형태로 사용
//		Object가 만들어놓은 형태는 "패키지명.클래스명@레퍼런스16진수" 이와 같다.
	//	System.out.println(tv.toString());
		
		
		b.buy(tv);
		System.out.println("현재 남은돈은 "+ b.money+"만원입니다.");
		System.out.println("현재 남은포인트는 "+ b.bonusPoint+"점입니다.");
		
		b.buy(com);
		System.out.println("현재 남은돈은 "+ b.money+"만원입니다.");
		System.out.println("현재 남은포인트는 "+ b.bonusPoint+"점입니다.");
	}

}
