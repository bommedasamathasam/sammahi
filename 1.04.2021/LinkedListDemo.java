import java.util.*;
class LinkedListDemo{
public static void main(String args[]){
	LinkedList<String> obj=new LinkedList<>();
	obj.add("C");
	obj.addLast("B");
	obj.add("S");
	obj.addFirst("A");
	obj.addLast("M");
	obj.add("E");
	obj.add(3,"D");
	System.out.println("Size of LinkedList: "+obj.size());
	System.out.println("Linked list: "+obj);
	obj.remove("C");
	obj.remove(2);
	obj.removeLast();
	obj.removeFirst();
	System.out.println("Size of LinkedList after deletion: "+obj.size());
	Iterator<String> itr=obj.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	boolean status=obj.contains("E");
	if(status)
		  System.out.println("List contains the element 'E' ");
        else
		  System.out.println("List doesnot contains the element 'E' ");
	Object ele=obj.get(2);
	System.out.println("Element returned by get(): "+ele);
	obj.set(2,"Y");
	System.out.println("List After change: "+obj);
	ListIterator<String> litr=obj.listIterator(2);
	while(litr.hasPrevious())
	System.out.println(litr.previous());
	obj.add("N");
	obj.add("G");
	System.out.println("Head Element of the list is:"+obj.pollFirst());
	System.out.println("LinkedList after removal using pollFirst():"+obj);
	System.out.println("Tail Element of the list is:"+obj.pollLast());
	System.out.println("LinkedList after removal using pollLast():"+obj);
  }
}
	