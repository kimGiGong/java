package day06;

import java.util.Scanner;

public class Test54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제1. 아래와같이 2차원 배열 arr을 출력하는 프로그램을 작성하세요. 
	    /*
	       1
	       1 2 3
	       1
	       1 2 3 4
	       1 2 
	    */
		
		int[][] arr= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int i=0; i<arr.length ;i++) {
			for(int j=0; j<arr[i].length ;j++) {
				System.out.print(arr[i][j]);
			}
		}
		// 문제2. Scanner로 소문자 알파벳 하나 입력받고, 
	    //      아래와 같이 출력하는 프로그램을 작성하세요. 
	    String str="hello";
	    char ch = str.charAt (1); 		// string->char 변환 (인덱스번호)
	    System.out.println(ch);			// index 1번 출력 e
	    /*
	       소문자 알파벳 하나를 입력하세요 >>   e  <- 콘솔에 입력 
	       abcde
	       abcd
	       abc
	       ab
	       a
	    */
		int z = 0;								//	알파벳 순번 위치 인덱스 저장용
		String a=sc.nextLine();
		String [] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","q","r","s","t","u","v","w","x","y","z"};
		for(int i=0;i<alpha.length;i++) {
			if(a.equals(alpha[i])) {			//	입력과 같은 알파벳 검사
				z=i;							//	알파벳 위치의 인덱스 저장
			}
		}
		for(int i=0 ; i<=z ;i++) {				//	행의 a~z 실행  i가 증가할수록 j=i 이기에 	별 몇줄 찍을지
			for(int j=i ; j<=z ;j++) {			//	j<=z 격차가 1씩 감소 = 1개씩 감소		별 몇개 찍을지
				System.out.print(alpha[j-i]);	//	0부터 시작하기 위한 j-i  j값은 증가하니 012345 이 됨
			}
			System.out.println();
		}
		
	    // 문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 
	    //       3의 배수만 출력하는 프로그램을 작성하세요. 
		int []beta= new int[10];
		System.out.println("정수입력 : 10개 ");
		for (int i=0; i<beta.length ; i++) {
			beta[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i=0 ; i<beta.length ; i++) {
			System.out.print((beta[i]*3)+"\t");
		}
	    System.out.println();
	    System.out.println();
	    
	    
	    
	    
	    // 문제4. 4x4의 2차원 배열(총16개방)을 만들고, 
	    //      1 ~ 10 까지 범위의 정수를 10개만 
	    //      랜덤하게 생성하여 임의의 위치에 저장하세요. 
	    //      동일한 정수가 있어도 상관없으나, 
	    //      나머지 6개의 숫자는 모두 0으로 만들고 
	    //      4x4의 형태로 출력하세요. 
	    /*
	     * 위치도 랜덤 값도 랜덤
	       출력예시)
	       3   0   7   2
	       0   9   1   4
	       2   4   0   5
	       0   8   0   0
	    */
	    int sasa[][] = new int[4][4];
	    while(true) {
	    	int zero = 0;
	    	for(int i=0; i<sasa.length;i++) {				// 0의 갯수를 서치 
	    		for(int j=0; j<sasa[i].length;j++) {
	    			if(0==sasa[i][j]) {
	    				zero++;
	    			}
	    		}
	    	}
	    	if(zero==6) {	// 0이 6개면 while break;
	    		break;
	    	}else {			// 랜덤위치 랜덤값입력
		    sasa[(int) (Math.random()*4)][(int) (Math.random()*4)]=(int)(Math.random()*10)+1;
		    }
	    }
	    for(int i=0; i<sasa.length;i++) {				//	출력
	    	for(int j=0; j<sasa[i].length;j++) {
	    		System.out.print(sasa[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    //////////////////////////// 정답 ///////////////////
	    int [][] board = new int[4][4];
	    int [] randNum = new int[10];
	    // board판을 모두 0으로 초기화
	    for(int i=0 ; i<board.length ; i++) {
	    	for(int j=0 ; j<board.length ; j++) {
	    		board[i][j] =0;
	    	}
	    }
	    
	    // 10개 랜덤 뽑아서 randNum 저장
	    for(int i=0; i< randNum.length;i++) {
	    	randNum[i] = (int)(Math.random()*10)+1;
	    }
	    //	10개 랜덤을 board에 넣어야하니
	    //	반복문 10번만 돌려서 board에 대입
	    for(int i=0; i< randNum.length;i++) {
	    	// 	board안 , 임의의 위치에 대입시켜야하니
	    	//	board의 위치를 가르키는 행,열 인덱스 번호 두개
	    	//	임의의 숫자가 필요
	    	//	행열 모두 0~3까지 곱4 해주면 됨
	    	int x = (int)(Math.random() *4);		// 	행 인덱스 랜덤
	    	int y = (int)(Math.random() *4);		// 	열 인덱스 랜덤
	    	//	중복체크 : 같은자리가 다시 뽑히면 안된다
	    	if(board[x][y] != 0) {
	    		i--;					// 0이 아니면 i값을 빼주어 1회차 다시
	    	}else {						
	    		board[x][y] = randNum[i];
	    	}
	    }
	    
	    for(int i=0; i<board.length;i++) {
	    	for(int j=0; j<board[i].length ; j++) {
	    		System.out.println(board[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    
	    
	    
		
		sc.close();

	}

}
