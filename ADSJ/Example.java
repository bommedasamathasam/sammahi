import java.util.*;
class Example{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Set<String> s=new LinkedHashSet<String>();
	System.out.println("Enter value of n");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		s.add(sc.nextLine());
	     }
	System.out.println(s);
   }
}