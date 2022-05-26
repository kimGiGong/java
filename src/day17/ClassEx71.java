package day17;			//	FileOutputStream

import java.io.FileOutputStream;

public class ClassEx71 {
	public static void main(String[] args) {
		
		byte [] b = {7,14,5,-2,45,100};
		
		//	파일로 내보내기
		try {
			//	#1. 객체생성 -> 출력스트림 생성
			FileOutputStream fout = new FileOutputStream("C:\\tmp\\test.out");
			//	#2. 출력내보내기 -> 쓰기
			for(int i =0 ; i<b.length ; i++) {
				fout.write(b[i]);	// write(int b)
			}
			fout.write(b);	//	배열 통으로 출력 내보내기 write(byte[]b)
			fout.close();
		
		}catch(Exception e){
			e.printStackTrace();	//	에러 발생시 빨간색 에러추적 메세지 출력해라~
		}
		
		
		
		
		
		
	}
}
