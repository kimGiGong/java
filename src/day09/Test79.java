package day09;

class Book {
	String title;		//	제목
	String author;		//	자까
	
	Book(String t){
		title = t;
		author = "산와머니";
	}
	Book(String t, String a){
		title =t;
		author = a;
	}
	
	
	
	
}


public class Test79 {

	
	
	
	
	
	public static void main(String[] args) {
		
		Book book = new Book("콩과팥");				// 책 생산
		System.out.println(book.title+"\t\t"+book.author);
		Book little = new Book("어린왕자","생텍쥐베리");				
		System.out.println(little.title+"\t"+little.author);

			
		
		
		
		
		
		
		

	}

}
