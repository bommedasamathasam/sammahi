import java.util.*;
class Item{
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
public class HashsetwithUDO{
public static void main(String args[]){
	Item i1=new Item(1,"aaa");
	Item i2=new Item(5,"bb");
	Item i3=new Item(10,"dd");
	Item i4=new Item(41,"xx");
	Item i5=new Item(3,"xs");
	HashSet<Item> t=new HashSet<Item>();
	t.add(i1);
	t.add(i2);
	t.add(i3);
	t.add(i4);
	t.add(i5);
	