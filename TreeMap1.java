import java.util.*;
import java.util.TreeMap;
class TreeMap1{
public static void main(String args[]){
	TreeMap<Integer,Double> emp=new TreeMap<Integer,Double>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println("Enter Employee number and salary of "+(i+1)+" Employee");
		int a=sc.nextInt();
		Double b=sc.nextDouble();
		emp.put(a,b);
        }
	System.out.println("---------------------");
	SortedMap<Integer,Double> s=emp.tailMap(30);
	System.out.println(s);
   }
}