package day09;

import java.util.Scanner;

/*
	Tv 	기능 구현
	1. 	채널 = 배열 10개방 만들어 랜덤값(1~999) 10개 생성후 배열에 낮은값 부터 대입
	2. 	채널 (Up,Down) : 정렬 상태에서 끝과 처음 루프하게
	3. 	채널값 입력받아 저장 : 랜덤에서 있는 채널만 ( 없는 채널 입력시 변경 안됨)
	4. 	볼륨은 0~10까지 증감 :	현재 범위를 초과하지 못하게
	5. 	음소거 기능
	6. 	Tv 상태값 출력하는 메소드 (전원, 채널 , 볼륨)
	7.	전원이 꺼져있는 경우 모든 기능 동작안함.
*/
class Tv {
	boolean power = false;
	int vol = 0;
	int chNum=0;
	int[] chlist = new int[10];
	
	void powerOnOff() {
		power = !power;
	}
	void chInput(int a) {
		for(int i =0; i<chlist.length ; i++) {
			if(chlist[i]==a) {
				chNum=i;
				break;
			}
		}
	}
	
	void SilenceMode() {
		vol = 0;
	}
	
	void volUp() {
		if (vol==10) {
			vol=10;
		}else {
			vol++; 
		}
	}
	void volDown() {
		if (vol==0) {
			vol=0;
		}else {
			vol--; 
		}
	}
	
	void chUp() {
		if (chNum==9) {
			chNum=0;
		}else {
			chNum++; 
		}
	}
	void chDown() {
		if (chNum==0) {
			chNum=9;
		}else {
			chNum--; 
		}
	}
	
	void ch (){
		for(int i=0; i<chlist.length ; i++) {
			if(i<chlist.length) {
				chlist[i] = (int)((Math.random()*999)+1);
			}
			// 중복처리
			for(int j=0; j<i ;j++) {
				if (chlist[i]==chlist[j]) {
					i--;
					break;
				}
			}
		}
		for(int i =0; i<chlist.length-1;i++) {
			int min=i;
			for(int j= i+1 ; j<chlist.length; j++ ) {
				if(chlist[i]>chlist[j]){
					int temp=chlist[i];
					chlist[i]=chlist[j];
					chlist[j]=temp;
				}//if
				
			}//for2
		}// for
	}//ch
	
	void info() {
		System.out.print("전원 상태 : ");
				if(power=true) {System.out.println("On");
				}else{System.out.println("Off");};
		System.out.println("채널 : "+chlist[chNum]);
		System.out.println("볼륨 : "+vol);
	}
	void list() {
		for(int i =0; i<chlist.length ; i++) {
			System.out.println(chlist[i]); 
			
		}
	}
	
}
public class Test71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv tv = new Tv();
		
		tv.powerOnOff();
		
		if(true==tv.power) {
			tv.ch();
			tv.info();
			System.out.println();
			tv.chUp();
			tv.info();
			System.out.println();
			tv.chDown();
			tv.info();
			System.out.println();
			tv.list();
			tv.chInput(Integer.parseInt(sc.nextLine()));
			tv.info();
			System.out.println();
			tv.chUp();
			tv.chInput(Integer.parseInt(sc.nextLine()));
			tv.info();
			System.out.println();
			tv.chDown();
			tv.info();
			System.out.println();
			tv.volUp();
			tv.info();
			System.out.println();
			tv.SilenceMode();
			tv.info();
			System.out.println();
			tv.volDown();
			tv.info();
			System.out.println();
		}
		
		
		
	}

}
