import java.util.*;
class Demo{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Set<String> s=new LinkedHashSet<String>();
	for(int i=0;i<7;i++){
		s.add(sc.nextLine());
	   }
	System.out.println(s);
  }
}