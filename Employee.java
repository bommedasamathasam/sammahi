import java.util.*;
import java.util.HashMap;
class Employee{
public static void main(String args[]){
	TreeMap<String,Double> hm=new TreeMap<String,Double>();
	Scanner sc=new Scanner(System.in);
	Double sum=0.0;
	System.out.println("Enter value of n");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println("Enter customer name and salary of "+(i+1)+" customer");
		sc.nextLine();
		String a=sc.nextLine();
		Double b=sc.nextDouble();
		hm.put(a,b);
	     }
	System.out.println(hm);
	hm.values().removeIf(x->x<30000);
	System.out.println(hm);
	
	//Set<Map.Entry<String,Double>> emp=hm.entrySet();
		//for(Map.Entry<String,Double> record:emp){
				//record.getValue()>=30000;
				//System.out.println(record.getKey()+":"+record.getValue());
		//}
  }
}