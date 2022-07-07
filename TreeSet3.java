import java.util.*;
import java.util.TreeSet;
class TreeSet3{
public static void main(String args[]){
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("APPLE");
	ts.add("MANGO");
	ts.add("GRAPES");
	ts.add("BANANA");
	ts.add("ORANGE");
	ts.add("PINEAPPLE");
	System.out.println("Original content of TreeSet:"+ts);
	System.out.println("Original content of TreeSet using descending Iterator:");
	Iterator<String> itr=ts.descendingIterator();
	while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element+" ");
		      } 
       }
}