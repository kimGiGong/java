package day08;
/*
  	문제 : Calc라는 클래스를 만들고,
  			덧셈 mySum, 뺄셈 mySub, 곱셈 myMul, 나눗셈 myDiv 메소드 4개를 만들고
  			main 에서 4가지 실행
 */
class Calc{
	int mySum (int a, int b) {
		return a+b;
	}
	int mySub (int a, int b) {
		return a-b;
	}
	int myMul (int a, int b) {
		return a*b;
	}
	double myDiv (int a, int b) {
		if (b == 0) {
			System.out.println("0으로 나누기불가");
			return 0;
		}else {
		return (double)a/b;
		}
	}
}

public class Test66 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int a = calc.mySum(5, 5);
		System.out.println(a);
		System.out.println(calc.mySub(1,5));
		System.out.println(calc.myMul(5, 10));
//		int b = calc.myDiv(5, 5);
		double c = calc.myDiv(5, 4);
//		System.out.println(b);
		System.out.println(c);
	}

}
