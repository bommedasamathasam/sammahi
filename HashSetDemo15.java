import java.util.*;
import java.util.HashSet;
class HashSetDemo15{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Set<String> c=new HashSet<String>();
	c.add("sam");
	c.add("samatha");
	c.add("anjum");
	c.add("sampu");
	c.add("gayathri");
	System.out.println("Children who likes cookies: "+c);
	System.out.println();
	Set<String> s=new HashSet<String>();
	s.add("sam");
	s.add("samatha");
	s.add("harini");
	s.add("namitha");
	System.out.println("Children who likes Banana chips: "+s);
	System.out.println();
	c.removeAll(s);
	System.out.println("Children who likes cookies: "+c);
	System.out.println();
	c.addAll(s);
	System.out.println("Children who likes Banana chips or Cookies: "+c);
	System.out.println();
	s.retainAll(c);
	System.out.println("Children who likes Banana chips and Cookies: "+s);
	System.out.println();
	
  }
}
