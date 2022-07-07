import java.util.*;
class IteratorDemo{
public static void main(String args[]){
	ArrayList<String> al=new ArrayList<String>();
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	System.out.println("Original content of al:"+al);
	System.out.println("Original content of al using Iterator:");
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()){
			String element=itr.next();
			System.out.print(element+" ");
		      } 
	System.out.println();
	ListIterator<String> litr=al.listIterator();
	while(litr.hasNext()){
			String element=litr.next();
			System.out.print(element+" ");
		      } 
	System.out.println();
	System.out.println("Modified content of al using Iterator:"+al);
	System.out.println("Modified list backward:");
	while(litr.hasPrevious()){
			String element=litr.previous();
			System.out.print(element+" ");
		      } 
	System.out.println();
       }
}