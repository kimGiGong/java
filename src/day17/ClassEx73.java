package day17;

import java.io.FileInputStream;

public class ClassEx73 {
	public static void main(String[] args) {
		
		byte [] b = new byte[12];		//	빈 배열 만들기
		
		FileInputStream fis = null;
		try {
			//	#1. 입력 스트림 생성
			fis = new FileInputStream("C:\\tmp\\test.out");

			//	#2-1. 한바이트 씩 읽어오기
			int n =0; 	//	배열 인덱스로 사용할 변수
			int c;		//	파일의 읽은 데이터 임시 저장 변수
			while((c = fis.read()) != -1) {	//	파일의 끝(EOF)까지 반복해서 읽기
				b[n] = (byte)c;		//	int로 읽어오므로 byte로 형변환해 byte배열에 담기
				n++;
			}
			//	#2-2 한번에 읽어오기
			fis.read(b);
			
			//	#3. 잘읽었는지 출력해서 확인
			for(int i=0; i<b.length; i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//	스트림 닫기
			if(fis != null) try {fis.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
