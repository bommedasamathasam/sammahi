import java.util.*;
class Item {
	String nm;
	int price;
public Item(int n,String nm){
	this.nm=nm;
	this.price=n;
}
public String toString(){
		return "\nPrice "+price+" Name :"+nm;
	}
}
class NameComparator implements Comparator<Item>{
public int compare(Item I1,Item I2){
	return I1.nm.compareTo(I2.nm);
   }
 }
public class ArrayListwithCompUDO{
public static void main(String args[]){
	Item i1=new Item(1,"aaa");
	Item i2=new Item(5,"bb");
	Item i3=new Item(10,"dd");
	Item i4=new Item(41,"xx");
	Item i5=new Item(3,"xs");
	ArrayList<Item> al=new ArrayList<Item>();
	al.add(i1);
	al.add(i2);
	al.add(i3);
	al.add(i4);
	al.add(i5);
	Collections.sort(al,new NameComparator());
	System.out.println(al);
   }
}