package day17;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ClassEx76 {
	public static void main(String[] args) {
		
		FileInputStream fin = null;
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("c:\\tmp\\outStrWrt.txt");
			in = new InputStreamReader(fin , "utf-8");
			
			System.out.println("encoding : "+ in.getEncoding());
			int c = 0;
			while((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fin != null) try {fin.close(); } catch(Exception e) {e.printStackTrace();}
			if(in != null) try {in.close(); } catch(Exception e) {e.printStackTrace();}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
