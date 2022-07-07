import java.util.*;
class MyComparator implements Comparator<Integer>{
@Override
public int compare(Integer o1,Integer o2){
	return o2.compareTo(o1);
 }
} 

public class CustomSortingTreeMapDemo{
public static void main(String args[]){
	TreeMap<Integer,String> std=new TreeMap<Integer,String>(new MyComparator());
	std.put(10,"Anjum");
	std.put(39,"Samatha");
	std.put(13,"Gayathri");
	std.put(31,"pravalika");
	System.out.println("TreeMap sorted in reverse order by its keys:\n"+std+"\n");
 }
}