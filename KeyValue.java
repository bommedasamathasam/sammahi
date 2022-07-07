import java.util.*;
class KeyValue<T>{
	T key;
	String name;
	int age;
	public KeyValue(){}
	public KeyValue(T key,String name,int age){
		this.key=key;
		this.name=name;
		this.age=age;
	}
 }

class LinearProbing<T>{
	private int currentsize;
	int maxSize;
	KeyValue<T>[] keyvalue;
	boolean[] bit;
	public LinearProbing(int capacity){
		currentsize=0;
		maxSize=capacity;
		keyvalue=new KeyValue[maxSize];
		bit=new boolean[maxSize];
		for(int i=0;i<maxSize;i++){
			keyvalue[i]=null;
			bit[i]=true;
               }
	}
	private int hash(T key){
		return key.hashCode() % maxSize;
	}
	int probe(int home,T key){
		int i=home;
		do{
		   if(keyvalue[i]==null)
			return i;
		  i=(i+1)%maxSize;
		}while(i!=home);
	return -1;
      }
	public boolean insert(T key,String name,int age){
		int home=hash(key);
		int index=probe(home,key);
		if(index!=-1){
			keyvalue[index]=new KeyValue(key,name,age);
			bit[index]=false;
			return true;
			}
		else
			return false;
       }
	public KeyValue get(T key){
		int home=hash(key);
		int i=home;
		do{
			if(keyvalue[i]!=null && key.equals(keyvalue[i].key))
			return keyvalue[i];
			i=(i+1)%maxSize;
		}while(i!=home && !bit[i]);
	return null;
	}
	public boolean delete(T key){
		int home=hash(key);
		int i=home;
		do{
			if(keyvalue[i]!=null && key.equals(keyvalue[i].key)){
			keyvalue[i]=null;
			return true;
		      }
		i=(i+1)%maxSize;
		}
		while(!bit[i] && i!=home);
		return false;
	}
	public KeyValue[] getList(){
		return keyvalue;
	}
}
class LPMain{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Table Size:");
	int size=sc.nextInt();
		LinearProbing<Integer> i=new LinearProbing<>(size);
		while(true){
		System.out.println("1.Insert");
           	System.out.println("2.Delete");
	   	System.out.println("3.Search");
	   	System.out.println("4.Display");
           	System.out.println("5.Exit\nEnter your choice:");
	   	int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			sc.nextLine();
			System.out.println("Enter the key value:");
			int key=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Name:");
			String name=sc.nextLine();
			System.out.println("Enter the Age:");
			int age=Integer.parseInt(sc.nextLine());
			boolean r=i.insert(key,name,age);
			if(!r)
				System.out.println("Can't Insert.Hash Table is full!");
			break;
		case 2:
			sc.nextLine();
			System.out.println("Enter the key value:");
			int k1=Integer.parseInt(sc.nextLine());
			boolean d=i.delete(k1);
			if(d)
				System.out.println(k1+" deleted from Hash Table");
			else
				System.out.println(" not available in Hash Table");
			break;
		case 3:
			sc.nextLine();
			System.out.println("Enter the key value:");
			int k=sc.nextInt();
			KeyValue<Integer> n=i.get(k);
			if(n!=null)
				System.out.println("Voter Id: "+n.key+"\n"+"Name	: "+n.name+"\n"+"Age	: "+n.age);
			else
				System.out.println(k1+" not available Hash Table");
			break;
		case 4:
			System.out.printf("%-11s%-15s%-11s%s\n","ID","Name","Age","Index");
			System.out.println("---------------------------------------------");
			int j=0;
			KeyValue<Integer> arr[]=i.getList();
			while(j<size){
				if(arr[j]!=null)
				System.out.printf("%-11s%-15s%-11s%s\n",arr[j].key,arr[j].name,arr[j].age,j);
				j++;
			}
			System.out.println();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Entry\n");
			break;
		}
	 }
    }
}    











			
		
		
	
	