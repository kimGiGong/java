package day14;		// finally

public class ClassEx36 {

	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(2);
//			System.out.println(0/0);
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(4);
		}finally {						//	catch 다음에 실행됨
			System.out.println(5);
		}
		System.out.println(6);
	}

}
