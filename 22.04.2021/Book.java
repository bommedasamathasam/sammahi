import java.util.*;
class Book{
	int bookno;
	String title;
	String author;
Book(){}
Book(int bno,String T,String A){
	bookno=bno;
        title=T;
	author=A;
 }
void setBookno(int bno){
	this.bookno=bno;
}
void setTitle(String T){
	this.title=T;
}
void setAuthor(String A){
	this.author=A;
}
int getRadius(){
	return bookno;
}
String getTitle(){
	return title;
}
String getAuthor(){
	return author;
}
void display(){
	System.out.println("Book Number "+bookno);
	System.out.println("Name of Book  "+title);
	System.out.println("Author of Book  "+author);
	
  }
}
class CollectionWithUserdefined{
public static void main(String[] args){
	TreeMap<Integer,Book> bookmap=new TreeMap<>();
	bookmap.put(1001,new Book(1001,"DBMS","Korth"));
	bookmap.put(1002,new Book(10012,"JAVA COMPLETE REFERENCE","Hs"));
	bookmap.put(1003,new Book(10011,"COMPUTER ORGANISATION","Morris mano"));
	bookmap.put(1004,new Book(1005,"OPERATING SYSTEM","XXX"));
	Set<Map.Entry<Integer,Book>> bookset=bookmap.entrySet();
	for(Map.Entry<Integer,Book> entry:bookset){
			System.out.println(entry.getKey());
			Book b=entry.getValue();
			b.display();
    }
 }
}