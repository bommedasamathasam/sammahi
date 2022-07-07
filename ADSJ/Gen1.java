import java.util.*;
class Gen1<T>{
	T ob1;
Gen1(T o){
	ob1=o;
 }
T getob1(){
	return ob1;
 }
}
class GenSub<T,V> extends Gen1<T>{
	V ob2;
	GenSub(T o1,V o2){
		super(o1);
		ob2=o2;
	    }
 V getob2(){
	 return ob2;
   }
}
class GenHeirarchy{
public static void main(String args[]){
	GenSub<Integer,String> iso=new GenSub <Integer,String> (10,"abc");
	System.out.println("ob1 of iso="+iso.getob1());
	System.out.println("ob2 of iso="+iso.getob2());
	GenSub<Double,Byte> ibo=new GenSub<Double,Byte> (10.5,(byte)10);
	System.out.println("ob1 of ibo="+ibo.getob1());
	System.out.println("ob2 of ibo="+ibo.getob2());
	
  }
}