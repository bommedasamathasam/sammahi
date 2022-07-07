import java.util.*;
class BankCustomerDemo{
	public static void main(String[] args){
		TreeMap<String,Double> hm=new TreeMap<String,Double>();
       		Scanner sc=new Scanner(System.in);
      		 String name="";
      		 double bal; 
      		 String r;
       		String[] r1;
		Double sum=0.0;
       		System.out.println("Enter  number of customers ");
       		int n=sc.nextInt();
       		sc.nextLine();
       		for(int i=0;i<n;i++){
          	System.out.println("Enter customer "+(i+1)+" name and bal separated by '-'");
          	r=sc.nextLine();
          	r1=r.split("-");
          	name=r1[0];
          	bal=Double.parseDouble(r1[1]);
          	hm.put(name,bal);
        	}
		Set<Map.Entry<String,Double>> cust=hm.entrySet();
		for(Map.Entry<String,Double> record:cust){
				System.out.println(record.getKey()+":"+record.getValue());
				sum=sum+record.getValue();
		}
		System.out.println("Sum of all balances of all customers:"+sum);

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
		hm.values().removeIf(x->x<75000);
		System.out.println("Customers bal>=75000 are: "+hm);
		hm.put("SHILPA",30000.0);
		System.out.println("Map After adding shilpa:"+hm);
		hm.remove("SHILPA");
		System.out.println("Map After removing shilpa:"+hm);
		System.out.println("Set of Keys are:"+hm.keySet());
		System.out.println("Displaying in descending order:");
		System.out.println(hm);
		
		}
}