import java.util.*;
class GenTwoParameters<T,V>{
	T ob1;
	V ob2;
GenTwoParameters(T o1,V o2){
	ob1=o1;
	ob2=o2;
 }
void display(){
	System.out.println("Value of ob1="+ob1);
	System.out.println("Value of ob2="+ob2);
   }
}
 
class GenTwoParametersDemo{
public static void main(String args[]){
	GenTwoParameters<Integer,String> gtp1=new GenTwoParameters<Integer,String>(10,"Hello");
	gtp1.display();
	GenTwoParameters<Double,Boolean> gtp2=new GenTwoParameters<Double,Boolean>(100.6,true);
	gtp2.display();
  }
}