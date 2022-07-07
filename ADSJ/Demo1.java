import java.util.*;
class Demo1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Set<Character> s=new LinkedHashSet<Character>();
		System.out.println("Enter String you want to check");
		String input=sc.nextLine();
		for(int i=0;i<input.length();i++){
			s.add(input.charAt(i));
			}
	System.out.println(s);
	}
}