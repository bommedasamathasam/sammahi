import java.util.*;
class tree1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<Integer> ();
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		
		System.out.println("Enter elements into tree set");
		for(int i=0;i<n;i++){
			int s=sc.nextInt();
			ts.add(s);
		}
		System.out.println("Enter an element");
		int ch=sc.nextInt();
		System.out.println("Element in tree set which is less than or equal to "+ch+" : "+ts.floor(ch));

	}
}