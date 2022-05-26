package day17;

import java.io.File;
import java.util.Date;

public class ClassEx70 {

	public static void main(String[] args) {
		//	경로 적을때 역슬래쉬 두개 "\\" -> \
		
		//	파일 객체 생성
		File f = new File("c:\\Windows\\System.ini");
		long size = f.length();
		System.out.println(size);
		//	파일 이름
		String filename =f.getName();
		System.out.println(filename);
		// 파일경로
		String path = f.getPath();
		System.out.println(path);
		String absolutePatg = f.getAbsolutePath();
		System.out.println(absolutePatg);
		//	상위 폴더 : 부모 디렉토리
		String parent = f.getParent();
		System.out.println(parent);
		//	파일,폴더 타입 판별
		if(f.isFile()) { System.out.println(f.getName()+"은(는) 파일입니다"); }
		else if(f.isDirectory()) { System.out.println(f.getName()+"은(는) 디렉토리 입니다."); }
		
		System.out.println("숨김 속성 = "+f.isHidden());
		System.out.println("읽기 속성 = "+f.canRead());
		System.out.println("쓰기 속성 = "+f.canWrite());
		Date date = new Date(f.lastModified());		// Date 객체는 millisecond 주고 생성 가능
		System.out.println("수정 날짜 = "+date);
		
		File f2 = new File("C:\\Windows\\Temp");
		String[] subList = f2.list();
		System.out.println("------------------------------");
		for(int i=0; i<subList.length; i++) {
			System.out.println(subList[i]);
		}
		System.out.println("------------------------------");
		
		//	파일 생성
		File f3 = new File("c:\\tmp\\test.txt");
		try {
			f3.createNewFile();
		}catch(Exception e) {
			System.out.println("에러 발생....");
		}
		
		// 디렉토리 만들기
		File f4 = new File("c:\\tmp\\hello");
		if(!f4.exists()) {	// 존재하지 않으면
			f4.mkdir();
		}
		
		
	}

}
