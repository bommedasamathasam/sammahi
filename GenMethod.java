import java.util.*;
class GenMethod{
static Boolean isIn<T,V extends T>(T[] x,V key){
	for(int i=0;i<x.length;i++){
			if(x[i].equals(key))
				return true;
			 }
		return false;
     }
}

class GenMethodDemo{
public static void main(String[] args){
	Integer inumbers[]={1,8,10,15,20};
	if(isIn(inumbers,10))
		System.out.println("10 is present in numbers");
	else
		System.out.println("10 is not present in numbers");
	String strs[]={"ab","ef","gh","xyz"};
        if(isIn(strs,"mn"))
		System.out.println("mn is present ");
	else
		System.out.println("mn is not present");
   }
}