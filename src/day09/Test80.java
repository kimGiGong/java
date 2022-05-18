package day09;

class Circle{
	int radius;
	
	// Circle(){ }			// 자동으로 생성된 스텔스 기본생성자
	
	void set(int r) {
		radius = r;
	}
	double getArea() {
		return radius * radius * 3.14;
	}
}


public class Test80 {

	public static void main(String[] args) {
		
		Circle pizza = new Circle();
		pizza.set(15);
		System.out.println(pizza.getArea());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
