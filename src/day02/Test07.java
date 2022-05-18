package day02;

public class Test07 {

	public static void main(String[] args) {
		
		//문제 : 정수형 변수 a와 b에 각가가 10, 20을 대입하고,
		//		값을 서로 교환해서 출력해보세요.
		
	// #1. 변수생성 + 값 대입하기
	int a=10 ,b =20;
	System.out.println(a+ " " + b); //10 20
	// #2. a변수의값과 b변수의 값을 교환해서 저장
	int c;
	c=a ; a=b; b=c; 
	System.out.println(a+ " " + b); //20 10
		
	}

}






