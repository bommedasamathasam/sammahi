import java.util.*;
import java.util.HashMap;
class Customer{
public static void main(String args[]){
	HashMap<String,Double> hm=new HashMap<String,Double>();
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
	System.out.println("Key/Value pair of customers using EntrySet");
	Set<Map.Entry<String,Double>> cust=hm.entrySet();
		for(Map.Entry<String,Double> record:cust){
				System.out.println(record.getKey()+":"+record.getValue());
				sum=sum+record.getValue();
		}
		System.out.println("Sum of  balances of all customers:"+sum);
		sc.nextLine();
		System.out.println("Enter the name of the customer to search");
		String s=sc.nextLine();
		if(hm.containsKey(s)){
			System.out.println("Balance of customer is :"+hm.get(s));
			}
		else{
			System.out.println("NOT FOUND");
			}

		System.out.println("Enter the name of the customer to be update:");
		String s1=sc.nextLine();
		System.out.println("Enter the bal  to be added:");
		double y=sc.nextDouble();
		System.out.println(hm.put(s1,hm.get(s1)+y));
	System.out.println("List After Removing Customer who has salary Below 75000 using RemoveIf Method");
	hm.values().removeIf(x->x<75000);
	System.out.println(hm);
	System.out.println("Map after adding some customers");
	hm.put("anjum",new Double(13000));
	hm.put("namitha",new Double(80000));
	System.out.println(hm);
	System.out.println("Set of Keys are:"+hm.keySet());
	System.out.println("Displying Map in descending order of values");
	Map<String, Double> sm = new TreeMap<String,Double>(hm);
	System.out.println(sm);
     }
  }
