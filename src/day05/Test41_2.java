package day05;

public class Test41_2 {

	public static void main(String[] args) {
		
		//	1문************
		for (int i=1 ; i<6 ; i++) {
			System.out.println(i+"행 : ***");
		}
		
		//		2문************
				for (int i=0 ; i<5 ; i++) {
					for (int j=0 ; j<=i ; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

		//		3문************
				System.out.println("3문");
				for (int i=0 ; i<10 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					for (int j=10 ; j>i ; j--) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");
					}
					System.out.println();
				}
				
		//		4문************
				for (int i=0 ; i<5 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					for (int j=0 ; j<5 ; j++) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print(i+j+1);
					}
					System.out.println();
				}
				System.out.println("5문");
		//		5문************
				for (int i=4 ; i>=0 ; i--) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식)  
					for (int j=0 ; j<5 ; j++) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print(i+j+1);
					}
					System.out.println();
				}
		//		6문************
				for (int i=0 ; i<9 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					if(i<5) {
					for (int j=0 ; j<=i ; j++) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");
					}
					}else
					for (int j=9 ; j>i ; j--) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");
					}
					System.out.println();
				}
		//		7문************
				for (int i=0 ; i<5 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식)  
					for (int j=5 ; j-1>i ; j--) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print(" ");
					}
					for (int j=0 ; j<=i ; j++) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println("8문");
		//		8문************
				for (int i=0 ; i<5 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					for (int j=0 ; j<i; j++) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print(" ");
					}
					for (int j=5 ; j>i ; j--) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println("9문");
		//		9문************
				for (int i=-5 ; i<=5 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					if (i<=0) {
						for (int j=5 ; j>i+5; j--) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print(" ");
						}
						for (int j=0 ; j<=i+5 ; j++) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print("*");
						}
					}else {
						for (int j=0 ; j<i; j++) { 			// 	(j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print(" ");
						}
						for (int j=5 ; j>=i ; j--) { 		//	(j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print("*");
						}
					}
						System.out.println();
				}
				System.out.println("10문");
		//		10문************
				for (int i=0 ; i<5 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					for (int j=4 ; j>i; j--) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print(" ");
					}
					for (int j=0 ; j<=i*2 ; j++ ) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println("11문");
		//		11문************
				for (int i=0 ; i<5 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					for (int j=0 ; j<i; j++) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print(" ");
					}
					for (int j=9 ; j>i*2 ; j-- ) { 		// (별의갯수 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println("12문");
		//		12문************
				for (int i=0 ; i<9 ; i++) { 					// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					for (int j=5 ; j>i||j+i>=9 ; j-- ) { 		// (별의갯수 ; 증감방향 ; 줄어듬 늘어남 )
						System.out.print("*");					// 왜인지 모름
					}
					System.out.println();
				}
		//		13문************
				System.out.println("13문");
				for (int i=0 ; i<9 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
					if(i<5) {
						for (int j=0 ; j<i; j++) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print(" ");
						}
						for (int j=5 ; j>i ; j-- ) { 		// (별의갯수 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print("*");
						}
					}else {
						for (int j=8 ; j>i; j--) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print(" ");
						}
						for (int j=3 ; j<i ; j++ ) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print("*");
						}
					}
					System.out.println();
				}
				
		//		14문************
				
				for (int i=0 ; i<5 ; i++) { 			// (시작행 ; 시작행-=행의 갯수 ; 증감식) 
						for (int j=5 ; j>i+1; j--) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print(" ");
						}
						for (int j=0 ; j<(i*2)+1 ; j++) { 		// (별의갯수 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print("*");
						}
					System.out.println();
				}
				for (int i=0 ; i<4 ; i++) {
						for (int j=0 ; j<i+1; j++) { 			// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print(" ");
						}
						for (int j=9 ; j>(i*2)+2 ; j-- ) { 		// (j-i시작열 ; 증감방향 ; 줄어듬 늘어남 )
							System.out.print("*");
						}
					System.out.println();
				}
				
				
				
		//		15문************
				for (int i=0; i<9 ; i++) {
					for (int j=0; j<5 ; j++) {
							if (i>=j+5||3-i>=j) {
								System.out.print("*");
							}else {
								System.out.print(" ");
							}
					}
					for (int j=9; j>5 ; j--) {
							if (i==j-4||i-2==j) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
						
						
					}
					System.out.println();
				}
		//		1문************
		//		1문************
		//		1문************
		//		1문************
		//		1문************
		//		1문************
		//		1문************
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
