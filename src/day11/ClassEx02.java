package day11;
//	상속을 이용하여 아래 클래스들을 간결한 구조로 재작성해 보세요.
class Pen{
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount=amount;}
}
class SharpPencil extends Pen{	//	(amount) , get/setAmount
	private int width;
}
class BallPen extends Pen{		//	(amount) , get/setAmount; 
	private String color;
	public String getColor() {return color;}
	public void setColor(String Color) {this.color= color;}
	
}
class FountainPen extends BallPen{	//	(amount) , get/setAmount , (color) , get/setColor
	public void refill(int n) {setAmount(n);}
}

public class ClassEx02 {

	public static void main(String[] args) {
		Object obj;	// java.lang package ->class summary Object
		
	}

}
