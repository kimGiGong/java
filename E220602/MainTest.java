package E220602;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainTest {
	ArrayList<Customer> al = new ArrayList<Customer>();
	Scanner sc= new Scanner(System.in);
	
	void add() {
		int restart =1;
		while(restart==1) {
			Customer a=null;
			String name,tel,birth,address;
			System.out.print("이름 : ");
			name=sc.nextLine();
			System.out.print("전화번호 예)010-9999-9999 : ");
			tel=sc.nextLine();
			System.out.print("생일 예) 12-18 : ");
			birth=sc.nextLine();
			System.out.print("주소 : ");
			address=sc.nextLine();
			a = new Customer(name, address , tel,birth); 
			al.add(a);
			System.out.println("추가 입력(y/n)>>");
			while(true) {
				String yn = sc.nextLine();
				if(yn.equals("y")||yn.equals("Y")) {
					break;
				}else if(yn.equals("n")||yn.equals("N")) {
					restart=0;
					break;
				}else{
					System.out.println("잘못입력");
					continue;
				}
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		MainTest mt= new MainTest();
		Date date = new Date();
		
		mt.add();
		String a[] = new String [mt.al.size()];
		for(int i=0; i<mt.al.size();i++) {
			String name =mt.al.get(i).name;
			String tel =mt.al.get(i).tel;
			String birth =mt.al.get(i).birth;
			String address =mt.al.get(i).address;
			a[i] = name+" "+tel+" "+birth+"생 "+address;
			String dm = "";
			if(date.getMonth()+1<10) {
				dm="0"+(date.getMonth()+1);
			}else {
				dm=(date.getMonth()+1)+"";
			}
			
			if((dm+"-"+date.getDay()).equals(birth)) {
				System.out.println("생일 축하합니다");
				a[i]= a[i]+"   생일 축하합니다";
			}
			
		}
		for(int i=0; i<mt.al.size();i++) {
			System.out.println(a[i]);
		}
		System.out.println("....이하 "+mt.al.size()+"명 가입");
		
		String file,str = "";
		file = "C:\\Users\\tjoeun\\Desktop\\customer.txt";
		for(int i=0; i<mt.al.size();i++) {
			str+=a[i]+"\n";
		}
		str+="....이하 "+mt.al.size()+"명 가입";
		FileOutputStream fout = null;
		OutputStreamWriter out = null;
		try {
			fout = new FileOutputStream(file);
			out = new OutputStreamWriter(fout);
			out.write(str);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fout != null) try {fout.close();}catch(Exception e) {e.printStackTrace();}
			if(out != null) try {out.close();}catch(Exception e) {e.printStackTrace();}
		}
			
	}

}
