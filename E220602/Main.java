package E220602;

public class Main {

	public static void main(String[] args) {
		Student A01 = new Student("A01", "나학생","JAVA반");
		Student A02 = new Student("A02", "홍길동","C++반");
		Staff S01 = new Staff("S01", "나직원", "교무팀");
		Staff S02 = new Staff("S02", "나도요", "취업지원팀");
		Ganasa G01 = new Ganasa("G01", "나선생", "프로그래밍");
		
		System.out.println(A01.print());
		System.out.println(A02.print());
		System.out.println(S01.print());
		System.out.println(S02.print());
		System.out.println(G01.print());
		int i=0;
		while(i<100) {
			int r = (int) ((Math.random()*45)+1);
		System.out.println(r);
		i++;
		}
	}

}
