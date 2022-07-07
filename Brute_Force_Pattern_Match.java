import java.util.*;
class Brute_Force_Pattern_Match{
int brute_Force(String T,String P){
	int n=T.length();
	int m=P.length();
	int i,k;
	for(i=0;i<=n-m;i++){
		k=0;
		while(k<m &&T.charAt(i+k)==P.charAt(k)){
		k++;
	  }
	if(k==m)
	   return i;
	}
    return -1;
 }
public static void main(String args[]){
	Scanner s1=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	String T,P;
	System.out.println("Enter main and Substring");
	T=s1.nextLine();
	P=s2.nextLine();
	Brute_Force_Pattern_Match B=new Brute_Force_Pattern_Match();
	int pos=B.brute_Force(T,P);
	if(pos==-1)
		System.out.println("Pattern not Found");
	else
		System.out.println("Pattern found at "+pos+" Position");
  }
}