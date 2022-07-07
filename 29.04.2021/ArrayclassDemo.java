import java.util.*;
public class ArrayclassDemo{
public static void main(String args[]){
	int A[]={1,4,3,6,10,5,8,9,7};
	int key=9;
	System.out.println(key+" Found at Index = "+Arrays.binarySearch(A,key));
	Arrays.sort(A);
	System.out.println("Sorted Array Elements of A:");
	for(Integer I:A)
		System.out.print(I+" ");
	System.out.println();
	int B[]={1,4,3,6,7,10,2,8,67};
	if(Arrays.equals(A,B))
		System.out.println("Both Arrays are equal");
	else
		System.out.println("Both Arrays are not equal");
	int C[]=new int[10];
	Arrays.fill(C,4);
	System.out.println("Elements of C:"); 
	for(Integer I:C)
		System.out.print(I+" ");
	System.out.println();
	System.out.println("String Representation of Array B:"+Arrays.toString(B));
   }
}