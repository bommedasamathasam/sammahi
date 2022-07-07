import java.util.*;
class HashMapDemo2{
public static void main(String args[]){
	HashMap<String,Double> sd=new HashMap<String,Double>();
	Double sum=0.0;
	sd.put("samatha",new Double(10000));
	sd.put("sam",new Double(120000));
	sd.put("sunny",new Double(156000));
	sd.put("samantha",new Double(45600));
	Set<Map.Entry<String,Double>> studentset=sd.entrySet();
	for(Map.Entry<String,Double> record:studentset){
			System.out.println("Name is:"+record.getKey());
			System.out.println("salary is:"+record.getValue());
			sum=sum+record.getValue();
    }
	System.out.println("Sum of salaries "+sum);
  }
}