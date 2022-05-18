package day05;

public class fucd {

	public static void main(String[] args) {
//		#6
		
		int star = 1; // 한줄에 찍어야하는 별의 갯수
		boolean flag = true; // 별이 증가하면 true, 별이 감소하면 false
		for(int i = 0 ; i<9 ; i++ ) {
			for(int j = 0 ; j<star; j++) {
				//별찍기
				System.out.print("*");
			}
			if(flag) { // flag가 true면,
				star++; // 별의갯수 증가
			}else {	//flag 가 false면,
				star--;//별의 갯수감소
			}
			
			if(star==5) { //별이 5개 찍혔으면
				flag = false; //flag를 false로 바꿔줌
				
			}
		System.out.println();
		}
	}
}

