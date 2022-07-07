import java.util.HashMap;
import java.util.Scanner;
class B_M_Pattern_Match{
	int m,n;
HashMap<Character,Integer> Last;
B_M_Pattern_Match(){
	Last=HashMap<Character,Integer>();
}
void LastOccurence(char[] T,char[] P){
   for(int i=0;i<n;i++)
	Last.put(T[i],-1);
	for(int k=0;k<m;k++)
	  Last.put(P[k],k);
}
int bm(char[] T,char[] P){
	int j,i,k;
	n=T.length();
	m=P.length();
	i=m-1;
	k=m-1;
	LastOccurence(T,P);
	while(i<n){
	  if(T[i]==P[k]){
		if(k==0)
		  return i;
		  k--;
		  i--;
	  }
	else{
	     j=Last.get(T[i]);
	     if(j==-1)
		i=i+m;
	     else if(j<k)
		i=i+m-(j+1);
	     else
		i=i+m-k;
		k=m-1;
          }
        }
    return -1;
}
public static void main(String[] args){
	Scanner s1=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	String T,P;
	System.out.println("Enter main and Substring");
	T=s1.nextLine();
	P=s2.nextLine();
	 B_M_Pattern_Match Bm=new  B_M_Pattern_Match();
	int pos=Bm.bm(T.toCharArray(),P.toCharArray());;
	if(pos==-1)
		System.out.println("Pattern not Found");
	else
		System.out.println("Pattern found at "+pos+" Position");
  }
}