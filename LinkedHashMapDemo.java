import java.util.*;
class LinkedHashMapDemo{
private static final int MAX=6;
public static void main(String args[]){
	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>(){
		protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest){
				return size()>MAX;
	}
   };
	map.put(0,"Welcome");
	map.put(1,"to");
	map.put(2,"The");
	map.put(3,"World");
	map.put(4,"of");
	map.put(5,"CVR");
	System.out.println(map);
	map.put(6,"CVR COLLEGE");
	System.out.println(map);
	map.put(7,"Hello");
	System.out.println(map);
   }
}