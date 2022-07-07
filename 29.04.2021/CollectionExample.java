import java.util.*;
public class CollectionExample{
public static void main(String args[]){
	List<Integer> list=new ArrayList<Integer>();
	list.add(46);
	list.add(10);
	list.add(16);
	list.add(24);
	list.add(39);
	list.add(22);
	System.out.println("Maximum Element "+Collections.max(list));
	System.out.println("Maximum Element "+Collections.min(list));
	System.out.println("Collection using sort method");
	Collections.sort(list);
	Iterator itr=list.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
	System.out.println("Collection using reverse order of sorting");
	Collections.sort(list,Collections.reverseOrder());
	Iterator i=list.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
    }
  }
} 