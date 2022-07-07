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
public String toString(){
	return "Book Number:"+bookno+"Title:"+title+"Author:"+author+"\n";
 }
}

class AuthorComparator implements Comparator<Book>{
	@Override
	public int compare(Book b1,Book b2){
		return b1.author.compareTo(b2.author);
  }
}
public class TreeMapwithComptrUserdefined1{
public static void main(String[] args){
	TreeMap<Book,Integer> bookmap=new TreeMap<>(new AuthorComparator());
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