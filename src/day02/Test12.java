package day02;
import java.util.Scanner; // 1. 클래스 가져오기
import java.util.ArrayList;
//파스칼 표기법 : 첫글자 모두 대문자(보통 클래스이름 지을때 사용)
public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 2. 입력받기
		
		//sc.nextLine();  3. 받은값 변수로 반환
		String[] array= {"name","age","blood","adress","tel","tall"};
		String[] head = {"이름","나이","혈액형","주소","전화번호","키"};
		for (int i=0;i < array.length;i++) {
		System.out.print(head[i]+":");
		array[i] = sc.nextLine();
		System.out.print( array[i]+"\n");
		}

		sc.close(); // 4. 입력받기종료(메모리누수 방지)
		
		//입력받기
		//이름 ,나이,혈액형,주소,전화번호,키....	
				
		/* 
		카멜표기법
		int myNumber;
		int yourNumber;
		int currPostion;
		
		스네이크 표기법
		int my_number;
		int your_number;
		int curr_postion;
				
		헝가리언 표기법		
		int iMyNumber
		
		*/
		
	}

}
