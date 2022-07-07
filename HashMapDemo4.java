import java.util.*;
class HashMapDemo4{
public static void main(String[] args)
    {
        HashMap<String,Double> hm=new HashMap<String,Double>();
	hm.put("John",new Double(3434.34));
	hm.put("Tom Smith",new Double(123.22));
	hm.put("Jane Baker",new Double(1378.00));
	hm.put("Tod Hall",new Double(99.22));
	hm.put("Ralph Smith",new Double(-19.08));
	Set<Map.Entry<String,Double>> myset=hm.entrySet();
	for(Map.Entry<String,Double> me:myset){
		System.out.print(me.getKey()+":");
		System.out.println(me.getValue());
	   }
	System.out.println("Resultant Balance After Increament");
	Set<Map.Entry<String,Double>> set=hm.entrySet();
	for(Map.Entry<String,Double> me:set){
        hm.put(me.getKey(), me.getValue()+1000);
		System.out.print(me.getKey()+":");
		System.out.println(me.getValue());
	   }
   }
}