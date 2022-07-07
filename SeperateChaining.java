import java.util.*;
class SeperateChaining<k extends Comparable<k>,v>{
	private int n,m;
	private Node<k,v>[] table;
	private class Node<k,v>{
	private k key;
	private v value;
	private Node<k,v> next;
public Node(){}
public Node(k key,v value,Node next){
	this.key=key;
	this.value=value;
	this.next=next;
	}
}
public SeperateChaining(int capacity){
	n=0;
	m=capacity;
	table=new Node[m];
	for(int i=0;i<m;i++)
		table[i]=null;
	}
public int size(){
	return n;}
public boolean isEmpty(){
	for(int i=00;i<m;i++)
	if(table[i]!=null)
	return false;
	return true;
}
public void insert(k key,v value){
	int home=hash(key);
	Node<k,v> npnode=new Node<>(key,value,null);
	Node<k,v> temp=table[home];
	if(table[home]==null){
	table[home]=npnode;
	}
	else{
	while(temp.next!=null){
	temp=temp.next;
	}
	temp.next=npnode;
	}
	n++;
 }
public v delete(k key){
	if(isEmpty()){
	System.out.println("Given data is not present in Hash Table");
	return null;
	}
	int home=hash(key);
	Node<k,v> temp=table[home];
	Node<k,v> prev=null;
	while(temp!=null && temp.key.compareTo(key)!=0){
	prev=temp;
	temp=temp.next;
	}
	if(temp!=null){
	if(temp==table[home])
	table[home]=temp.next;
	else
	prev.next=temp.next;
	return temp.value;
	}
	System.out.println("Given data is not present");
	return null;
	}
public void search(k key){
	int home=hash(key);
	Node<k,v> temp=table[home];
	while(temp!=null && !key.equals(temp.key)){
	temp=temp.next;
	}
	if(temp!=null)
	System.out.println("ID:"+temp.key+"\nValue:"+temp.value);
	else
	System.out.println("Not found");}
public void display(){
	Node<k,v> temp;
	for(int i=0;i<m;i++){
	System.out.println("Data at index"+i+"in Hash Table:");
	System.out.println("ID      Value");
	System.out.println("_");
	temp=table[i];
	while(temp!=null){
	System.out.println(temp.key+"\t"+temp.value);
	temp=temp.next;
      }
     }
 }
private int hash(k key){
	return key.hashCode()%m;
  }
}


class SCmain{
public static void main(String arjs[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Hash Table");
	int n=sc.nextInt();
	int val,ch=0;
	System.out.println("Enter the combination of datatype you want to be added in hash table");
	System.out.println("1.integer and String,2.String and Double");
	int n1=sc.nextInt();
	String name;
	SeperateChaining<Integer,String> sci=new SeperateChaining<Integer,String>(n);
	do{
	System.out.println("1.insertion\n2.deletion\n3.searching\n4.display\n5.exit\nEnter your Choice");
	ch=sc.nextInt();
	switch(ch){
		case 1:System.out.println("Enter key");
			val=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter value");
			name=sc.nextLine();
			sci.insert(val,name);break;
		case 2:System.out.println("Enter key to delete");
			val=sc.nextInt();
			sci.delete(val);break;
		case 3:System.out.println("Enter key to search");
			val=sc.nextInt();
			sci.search(val);break;
		case 4:sci.display();break;
		case 5:System.exit(0);break;
		default: System.out.println("Invalid option");}
	}while(ch<5);
	if(n1==2){
		String v;
		double d;
		SeperateChaining<String,Double> sci1=new SeperateChaining<String,Double>(n);
	do{
		System.out.println("1.insertion\n2.deletion\n3.searching\n4.display\n5.exit\nEnter your Choice");
		ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("Enter key");
			v=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter value");
			d=sc.nextDouble();
			sci1.insert(v,d);
			break;
		case 2:
			System.out.println("Enter key to delete");
			v=sc.nextLine();
			sci1.delete(v);
			break;
		case 3:System.out.println("Enter key to search");
			v=sc.nextLine();
			sci1.search(v);
			break;
		case 4:sci1.display();
			break;
		case 5:System.exit(0);
			break;
		default: System.out.println("Invalid option");
		}
	}while(ch<5);
    }
}
}