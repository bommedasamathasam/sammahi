import java.util.*;
class ContainsDemo{
public static void main(String args[]){
	Map<String,Integer> salesmen=new HashMap<String,Integer>();
	salesmen.put("Mathew",50);
	salesmen.put("Lisa",76);
	salesmen.put("Courtney",45);
	salesmen.put("David",49);
	salesmen.put("Paul",49);
	System.out.println(salesmen);
	if(salesmen.containsKey("Lisa")){
		System.out.println("Number of products sold by Lisa is "+salesmen.get("Lisa"));
        }
   }
}	
	