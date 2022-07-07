import java.util.*;
public class ArrayclassDemo1{
public static void main(String[] args){
	Integer A[]={1,4,3,6,7,10,5,2,8,67};
	Set<Integer> s=new HashSet<>(Arrays.asList(A));
	System.out.println(s);
   }
}