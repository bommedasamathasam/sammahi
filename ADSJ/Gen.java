import java.util.*;
class Gen<T>{
	T ob;
Gen(T o){
	ob=o;
 }
T getOb(){
	return ob;
 }
void showType(){
	System.out.println("Type of ob="+ob.getClass().getName());
 }
}
class GenDemo{
public static void main(String args[]){
	Gen<Integer> igo=new Gen<Integer>(10);
	igo.showType();
	int i=igo.getOb();
	System.out.println("i="+i);
	Gen<String> sgo=new Gen<String>("Hello");
	sgo.showType();
	String str=sgo.getOb();
	System.out.println("str="+str);
	
  }
}