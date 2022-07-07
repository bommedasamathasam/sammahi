import java.util.*;
class HashsetDemo {
public static void main(String args[]) {
	HashSet<String> hs = new HashSet<String>();
	System.out.println("Size of HashSet "+hs.size());
	hs.add("B");
	hs.add("A");
	hs.add("D");
	hs.add("E");
	hs.add("C");
	hs.add("F");
	System.out.println("Size of HashSet "+hs.size());
	System.out.println("HashSet contains "+hs);
	hs.remove("D");
	hs.remove("F");
	hs.remove(4);
	System.out.println("After Deleting HashSet contains "+hs);
	System.out.println("Size of HashSet "+hs.size());
 }
}