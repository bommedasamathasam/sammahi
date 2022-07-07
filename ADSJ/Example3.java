import java.util.*;
class Example3{
public static void main(String args[]){
	Set<String> s=new TreeSet<String>();
	s.add("one");
	s.add("two");
	s.add("three");
	s.add("four");
	s.add("one");
	Iterator it=s.iterator();
	while(it.hasNext()){
	System.out.println(it.next()+" ");
	
   }
}
}