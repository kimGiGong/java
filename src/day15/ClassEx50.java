package day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassEx50 {
	public static void main(String[] args) {
		
		Date day = new Date();
		System.out.println(day);
		System.out.println(day.getMonth());	// 0~11월	
		
		//	날짜 포맷(형태)을 원하는 형태로 변경해서 사용
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 yy년MM월dd일입니다.");
		
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		
		
		
		
	}
}
