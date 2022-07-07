import java.util.*;
class Frequency{
public static void main(String args[]){
 String str;
 int f=0;
 HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter String you want to check");
 str=sc.nextLine();
 for(int i=0;i<str.length();i++){
 char ch=str.charAt(i);
 if(!hm.containsKey(ch))
 	hm.put(ch,1);
 else
       f=hm.get(ch);
       hm.put(ch,f+1);

}
   System.out.println(hm);
  }
}