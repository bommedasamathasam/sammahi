import java.util.*;
class ArrayListDemo{
public static void main(String args[]){
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("Intial size of al: "+al.size());
	al.add("C");
	al.add("B");
	al.add("S");
	al.add("A");
	al.add("M");
	al.add("E");
	al.add(1,"D");
	System.out.println("Size of al after addition: "+al.size());
	System.out.println("Content of al: "+al);
	al.remove("C");
	al.remove(2);
	System.out.println("Size of al after deletion: "+al.size());
	System.out.println("Content of al: "+al);
  }
}