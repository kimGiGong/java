package day09;
/*
	1. char[] 배열을 전달받아 출력하는 printCharArray() 메소드
	2. 배열속의 ' ' 공백문자를 ','쉼표로 대치하는 replaceSpace() 메소드를 작성해보자
 */
public class Test72 {
	static void printCharArray(char[]a) {
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i]);
//		for (char cc : a){
//			System.out.println(cc);
//		}
			
		}
		System.out.println();
	}
	static void replaceSpace(char []a) {
		for(int i=0; i<a.length ; i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
	}

	public static void main(String[] args) {
		
		char[] c = {'I',' ','a','m',' ','a',' ','b','o','y'};
		printCharArray(c); 	// I am a boy 출력
		replaceSpace(c);
		printCharArray(c); 	// I,am,a,boy 출력
		
		
		
	}

}
