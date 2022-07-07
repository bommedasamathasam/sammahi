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
class PriceComparator implements Comparator<Item>{
public int compare(Item I1,Item I2){
	if(I1.price==I2.price)
		return 0;
	else if(I1.price>=I2.price)
		return 1;
	else
		return -1;
   }
}
class NameComparator implements Comparator<Item>{
public int compare(Item I1,Item I2){
	return I1.nm.compareTo(I2.nm);
   }
 }

public class TreesetwithUDO2{
public static void main(String args[]){
	Item i1=new Item(1,"aaa");
	Item i2=new Item(5,"bb");
	Item i3=new Item(10,"dd");
	Item i4=new Item(41,"xx");
	Item i5=new Item(3,"xs");
	TreeSet<Item> t=new TreeSet<>(new PriceComparator());
	t.add(i1);
	t.add(i2);
	t.add(i3);
	t.add(i4);
	t.add(i5);
	System.out.println(t);
	TreeSet<Item> t2=new TreeSet<>(new NameComparator());
	t2.addAll(t);
	System.out.println(t2);
  }
}