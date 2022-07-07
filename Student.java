import java.util.*;
import java.util.TreeMap;
class Example{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	TreeMap<String> s=new LinkedHashSet<String>();
	System.out.println("Enter value of n");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		s.add(sc.nextLine());
	     }
	System.out.println(s);
   }
}