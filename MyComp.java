import java.util.*;
class MyComp implements Comparable<MyComb>{
@Override
public int compareTo(String aStr,String bStr){
	return bStr.compareTo(aStr);
 }
}
class CompDemo{
public static void main(String args[]){
	TreeSet<String> ts=new TreeSet<String>(new MyComp());
	ts.add("C");
	ts.add("A");
	ts.add("b");
	ts.add("E");
	ts.add("F");
	ts.add("d");
	for(String element:ts)
		System.out.println(element+" ");
		System.out.println();
  }
}