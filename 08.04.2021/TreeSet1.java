import java.util.*;
import java.util.TreeSet;
class TreeSet1{
public static void main(String args[]){
	SortedSet<Integer> ts=new TreeSet<Integer>();
	ts.add(10);
	ts.add(22);
	ts.add(39);
	ts.add(13);
	ts.add(26);
	ts.add(40);
	System.out.println(ts);
	ts=ts.tailSet(13);
	System.out.println(ts);
	ts=ts.headSet(13);
	System.out.println(ts);
   }
} 