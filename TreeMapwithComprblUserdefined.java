import java.util.*;
class Book implements Comparable<Book>{
	int bookno;
	String title;
	String author;
Book(){}
Book(int bno,String T,String A){
	bookno=bno;
        title=T;
	author=A;
 }
public String toString(){
	return "Book Number:"+bookno+"Title:"+title+"Author:"+author+"\n";
 }
@Override
public int compareTo(Book b1){
	return this.title.compareTo(b1.title);
  }
}
public class TreeMapwithComprblUserdefined{
public static void main(String[] args){
	TreeMap<Book,Integer> bookmap=new TreeMap<>();
	bookmap.put(new Book(1001,"DBMS","Korth"),500);
	bookmap.put(new Book(10012,"JAVA COMPLETE REFERENCE","Hs"),300);
	bookmap.put(new Book(10011,"COMPUTER ORGANISATION","Morris mano"),600);
	bookmap.put(new Book(1005,"MOBILE APPLICATION","Android"),200);
	Set<Map.Entry<Book,Integer>> bookset=bookmap.entrySet();
	for(Map.Entry<Book,Integer> entry:bookset){
			Book b=entry.getKey();
			System.out.println("Book Details "+b+"Price:"+entry.getValue());
    }
 }
}