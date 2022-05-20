package day14;			//	예외 발생시키는 키워드  throw

public class ClassEx37 {

	public static void main(String[] args) {

		try {
			
			System.out.println("hello");
			//	에러 메세지 지정하고 Exception 객체 생성해서 예외 던짐!!
			throw new Exception("고의로 예외 발생시킨거야");
//			System.out.println("java");		오류 발생할것을 문법적으로 안다.
		}catch(Exception e){
			System.out.println("에러메세지 : "+e.getMessage());
			e.printStackTrace();			//	에러 힌트가 출력됨.
			System.out.println("Exception 발생!!!!!!!!!!");
		}
	}

}
