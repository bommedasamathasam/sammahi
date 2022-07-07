import java.util.*;
class RemoveIf{
public static void main(String args[]){
	ArrayList<Integer> a=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println("Enter"+(i+1)+"Element of List");
		a.add(sc.nextInt());
        }
	System.out.println(a);
	System.out.println("List After Removing Odd Elements");
	a.removeIf(x->x%2==1);
	System.out.println(a);
  }
}