import java.util.*;
import java.util.TreeSet;
class TreeSet4{
public static void main(String args[]){
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("SAMATHA");
	ts.add("ANJUM");
	ts.add("SAMPADA");
	ts.add("GAYATHRI");
	ts.add("NAMITHA");
	ts.add("PRAVALIKA");
	System.out.println("Original content of TreeSet:"+ts);
	System.out.println("Size of TreeSet:"+ts.size());
	String a="SAMATHA";
	boolean exist=ts.contains(a);
	System.out.println("Contains "+a+" "+exist);
	System.out.println("First element of TreeSet:"+ts.first());
	System.out.println("Last element of TreeSet:"+ts.last());
	String b="SAMATHA";
	System.out.println("Higher "+ts.higher(b));
	System.out.println("Lower "+ts.lower(b));
  }
}