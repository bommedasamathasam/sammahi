import java.util.*;
class HashMapDemo1{
public static void main(String args[]){
	HashMap<String,Integer> sd=new HashMap<String,Integer>();
	sd.put("samatha",99119);
	sd.put("sam",901004);
	sd.put("sunny",995);
	sd.put("samantha",9942);
	Set<Map.Entry<String,Integer>> studentset=sd.entrySet();
	for(Map.Entry<String,Integer> record:studentset){
			System.out.println("Key is:"+record.getKey());
			System.out.println("Value is:"+record.getValue());
    }
  }
}