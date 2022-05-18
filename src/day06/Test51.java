package day06;

import java.util.Scanner;

public class Test51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//			* (비)정방배열 문제 * 
// 			문제1. 아래와 같은 형태의 정방배열을 만들어 값을 저장하고 출력해보세요.
		/*
		 	10	20	30
		 	40	50	60
		 	70	80	90
		 */
			int [][] arr76= {{10,20,30},{40,50,60},{70,80,90}};
			for(int i=0 ; i<arr76.length ; i++) {
				for(int j=0; j<arr76[i].length ; j++) {
					System.out.print(arr76[i][j]+"\t");
				}
				System.out.println();
			}
			
//			문제2. int형 3행 2열의 정방배열을 만들고
//		 			각 방에 정수를 입력받아 저장하고 출력하세요.
			int[][] x32 = new int[3][2];
			for(int i=0 ; i<x32.length ; i++) {
				for(int j=0; j<x32[i].length ; j++) {
					System.out.println(i+1+"행"+(j+1)+"열의 값을 입력 : ");
					x32[i][j] = Integer.parseInt(sc.nextLine());	// 코드 줄이기 바로 변수에 입력
				}
			}
			for(int i=0 ; i<x32.length ; i++) {
				for(int j=0; j<x32[i].length ; j++) {
					System.out.print(x32[i][j]+"\t");
				}
				System.out.println();
			}
			
			
//			문제3. 아래와 같은 형태의 비정방배열을 만들어
//				아래와 같이 값을 저장하고 출력하세요.
			/*
			 10 11	12
			 20	21
			 30	31	32
			 40	41
			 */
			int [][] arr32= {{10,11,12},{20,21},{30,31,32},{40,41}};
			for(int i=0 ; i<arr32.length ; i++) {
				for(int j=0; j<arr32[i].length ; j++) {
					System.out.print(arr32[i][j]+"\t");
				}
				System.out.println();
			}
			
		
//			문제4. 한층에 5호씩있는 3층짜리 아파트가 있다.
			int [][] apt35 = new int[3][5];
			
//			1)	배열로 만들어서 각각 호마다 관리비를 입력받고, 전체 출력해보세요.
			for(int i=0 ; i<apt35.length ; i++) {
				for(int j=0; j<apt35[i].length ; j++) {
					System.out.println(i+1+"층"+(j+1)+"호의 값을 입력 : ");
					int apti = Integer.parseInt(sc.nextLine());
					apt35[i][j]=apti;
				}
			}
			for(int i=0 ; i<apt35.length ; i++) {
				for(int j=0; j<apt35[i].length ; j++) {
					System.out.print(apt35[i][j]+"\t");
				}
				System.out.println();
			}
//			2)	층별 관리비 평균을 구해서 출력해보세요
			for(int i=0 ; i<apt35.length ; i++) {
				int favg = 0;
				for(int j=0; j<apt35[i].length ; j++) {
					favg += apt35[i][j];
				}
				favg=favg/apt35[i].length;
				System.out.println(favg+" "+(i+1)+"층평균 관리비");
			}
			
//			3)	전체 관리비 평균을 구해서 출력해보세요.
			int avg=0;
			for(int i=0 ; i<apt35.length ; i++) {
				int favg = 0;
				for(int j=0; j<apt35[i].length ; j++) {
					favg += apt35[i][j];
				}
				favg/=apt35[i].length;
				avg+=favg;
			}
			avg/=apt35.length;
			System.out.println(avg+" 평균관리비");
			
//			4)	103호 와 203호의 관리비가 서로 바뀌어었다합니다. 교환해주세요.
			int temp;
			temp=apt35[0][2];
			apt35[0][2]=apt35[1][2];
			apt35[1][2]=temp;
			System.out.println(apt35[0][2]+"\t"+apt35[1][2] +"\n"+"103호 와 203호 교환");
			
//			5)	전체 관리비 평균보다 관리비가 적게 나오는 호수들을 출력하세요.
			System.out.println("관리비적음");
			for(int i=0 ; i<apt35.length ; i++) {
				for(int j=0; j<apt35[i].length ; j++) {
					if(avg>apt35[i][j]) {
						System.out.print((i+1)+"0"+(j+1)+"호  ");
					}
				}
			}
			System.out.println();
			
//			6)	관리비가 가장 적게 나온 호수와 가장 많이 나온 호수를 출력하세요.
			int max=0;
			int min=0;
			for(int i=0 ; i<apt35.length ; i++) {
				for(int j=0; j<apt35[i].length ; j++) {
					if(max<apt35[i][j]) {
						max=apt35[i][j];
					}
				}
				for(int j=0; j<apt35[i].length ; j++) {
					if(min>apt35[i][j]) {
						min=apt35[i][j];
					}
				}
			}
			System.out.println(max+" <- 최대 최소 ->"+min);
			
			/////////////////////// 정 답 ////////////////////////////////////////
			
			/*
			int [][]fee = new int[3][5];
			int maxmax= fee[0][0];
			int maxI=0;
			int minJ=0;
			for(int i=0 ; i<apt35.length ; i++) {
				for(int j=0; j<apt35[i].length ; j++) {
					if(maxmax<apt35[i][j]) {
						maxmax=apt35[i][j];
					}
				}
				for(int j=0; j<apt35[i].length ; j++) {
					if(min>apt35[i][j]) {
						min=apt35[i][j];
					}
				}
			}
			
			*/
			
			
			
			
			
			
			
			
			
			
			
//			7)	(심화)관리비가 적게 나오는 순으로 정렬하세요.
			int [][]fee = new int[3][5];
			int m1=0;
			int m2=0;
			for(int a=0 ; a<fee.length ; a++) {
				for(int b=0 ; b<fee[a].length ; b++) {
					for(int i=0 ; i<apt35.length-1 ; i++) {
						m2=i;
						for(int j=i+1 ; j<apt35[i].length ; j++) {
							if(apt35[m1][m2]<apt35[i][j]) {
									m1=i;
									m2=j;
							}
						}
					}
					fee[a][b]=apt35[m1][m2];
					apt35[m1][m2]=0;
				}
			}
			for(int i=0 ; i<apt35.length ; i++) {
				for(int j=0; j<apt35[i].length ; j++) {
					System.out.print(apt35[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			System.out.println();
		
		
		
		////////////// 정답 ///////////////////////////////////
			String [][] ho = {
					{"101","102","103","104","105"},
					{"201","202","203","204","205"},
					{"301","302","303","304","305"}
			};
			int [] arr = new int[15];
			String [] ho1= new String[15];
			int idx = 0;
			for(int i=0 ; i <apt35.length ; i++) {
				for(int j=0 ; j <apt35[i].length ; j++) {
					arr[idx] = apt35[i][j];
					ho1[idx] = ho[i][j];
					idx++;
				}
			}
			// 정렬
			for(int i=0; i<arr.length-1 ; i++) {
				for(int j=i+1 ; j<arr.length ; j++) {
					if (arr[i] > arr[j]) {
						int temp1 = arr[i];
						arr[i]=arr[j];
						arr[j]=temp1;
						
						String tmpStr = ho1[i];
						ho1[i]=ho1[j];
						ho1[j]= tmpStr;
					}
				}
			}
			
			
			
		
		
		
		
		
		
		
		sc.close();
		
	}

}
