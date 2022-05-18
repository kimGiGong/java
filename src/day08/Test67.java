package day08;

//	Tv 클래스
//	변수 : 채널, 볼륨, 전원
//	메소드 : 전원 on/off, 채널 변경, 볼륨조정, 채널입력해서 변경
class Tv{
	int ch = 1, vol = 0;
	boolean power = false;
	
	void powerOnOff() {
		power = !power;			//	power of not power
	}
	void chUp() {
		ch++;
	}
	// chDown(), volUp(), volDown, chChange()
	void chDown() {
		ch--;
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
	void chChange(int a) {
		ch=a;
	}
	
}



public class Test67 {

	public static void main(String[] args) {
		
		Tv tv= new Tv();
		System.out.println(tv.power);
		tv.powerOnOff();
		System.out.println(tv.power);
		tv.chUp();
		System.out.println(tv.ch);
		tv.chDown();
		System.out.println(tv.ch);
		tv.volUp();
		System.out.println(tv.vol);
		tv.volDown();
		System.out.println(tv.vol);
		tv.chChange(555);
		System.out.println(tv.ch);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
