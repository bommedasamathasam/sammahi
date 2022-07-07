import java.util.*;
import java.util.LinkedHashSet;
class LinkedHashDemo{
	public static void main(String args[]){
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(lhs.size());
	lhs.remove("A");
	System.out.println(lhs);
	}
}