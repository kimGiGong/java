package day17;		//	FileOutputStream

import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;

public class ClassEx72 {
	public static void main(String[] args) {
		
		//	사용자로부터 입력을 받고, 입력받은 형태로 파일로 저장해보자.
		//	입력 : 파일명 입력받고, 저장할 문자열도 입력
		
		String file, str;	//	file은 파일명입력받아 저장, str은 파일에 쓸 내용
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		str = "파일 생성시간 \n\n"+ date + "\n\n";
		
		// 파일명 입력받기 : C:\\tmp\\fout.txt (텍스트파일로 저장되게)
		System.out.println("파일 이름 입력 >>");
		file = sc.nextLine().trim();	//	앞뒤 공백 제거해서 변수에 저장
		
		//	파일에 저장할 내용입력받기
		System.out.println("저장할 문자열 입력>>");
		str += sc.nextLine();
		
		System.out.println(file);
		System.out.println(str);
		
		//	바이트 스트림으로 내보내기
		byte[] strBytes = str.getBytes();	// String -> byte[]로 변환해서 리턴
		
		FileOutputStream fout = null;
		try {
			fout=new FileOutputStream(file);	// new~ 가 예외처리 필수
			fout.write(strBytes);
			System.out.println("저장되었습니다.");
			
//			fout.close();	// 예외가 터지면 실행안되고 건너뛸수 있으므로
							//	finally 블럭에서 닫기
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// null이 아니면	닫아봐라	(스트림 ,스캐너 닫기)
			if(fout != null)  try { fout.close(); }catch(Exception e) { e.printStackTrace(); } 
			if(sc != null)  try { sc.close(); }catch(Exception e) { e.printStackTrace(); } 
		}
		
		
		System.out.println(file + "파일이 성공적으로 저장되었다.");
		
	}
}
