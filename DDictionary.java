import java.util.*;
import java.io.*;
interface DDictionary<K extends Comparable<K>,V>{
    void insert(Pair<K,V> P);
    void delete(K key);
    Pair<K,V> find(K key);
    int size();
    boolean isEmpty();
    void display();
}
class Pair<K extends Comparable<K>,V>{
     K key;
     V value;
     Pair(){};
     Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
     @Override
     public String toString(){
        return "key:"+key+"value:"+value;
     }
}

class PairNode<K extends Comparable<K>,V>{
   Pair<K,V> data;
   PairNode<K,V> next;
   PairNode(){}
   PairNode(Pair<K,V> P, PairNode<K,V> next){
      this.data=P;
      this.next=next;
   }
}
class SortedChain<K extends Comparable<K>,V> implements DDictionary<K,V>{
	PairNode<K,V> head;
	int dsize;
   	public boolean isEmpty(){
        	return head==null;
   	}
   	public int size(){
          	return dsize;
   	}
	public void insert(Pair<K,V> P){
   		PairNode<K,V> npNode=new PairNode<K,V>(P,null);
   		PairNode<K,V> temp;
   		PairNode<K,V> prev;
   		if(isEmpty()){
       			head=npNode;
   		}
   		else{
        		if(P.key.compareTo(head.data.key)<0){
           			npNode.next=head;
           			head=npNode;
           		}
    			else{
          			temp=head;
          			prev=null;
         			while(temp!=null && P.key.compareTo(temp.data.key)>0){
           				prev=temp;
           				temp=temp.next;
         			}
        			npNode.next=prev.next;
        			prev.next=npNode;
       			}
		}
     		dsize++;
   	}//CLOSE INSERT
	public void display(){
    		PairNode<K,V> temp;
    		if(isEmpty()){
     			System.out.println("Dictionary is empty");
    		}
    		else{
      			temp=head;
      			while(temp!=null){
        			System.out.println("Key : "+temp.data.key+"  Value : "+temp.data.value);
        			temp=temp.next;
			}
      		}
    	}
	public Pair<K,V> find(K key){
     		Pair<K,V> t=null;
     		PairNode<K,V> temp=head;
     		while(temp!=null&&key.compareTo(temp.data.key)>0){
            		temp=temp.next;
     		}
     		if(temp!=null)
     		if(temp.data.key.equals(key))
       		t=temp.data;
       		return t;
	}
	public void delete(K key){
		PairNode<K,V> temp=head;
		PairNode<K,V> prev=null;
		
		
		while(temp!=null&&key.compareTo(temp.data.key)>0){
			prev=temp;
			temp=temp.next;
      		}
		if(temp==null){  
      			System.out.println("Dictionary might be empty");
			return;
      		}
      		
     		if(temp.data.key.equals(key)){
     	 		System.out.println("Deleted entry is "+temp.data);
      			if(temp==head){
           			head=head.next;
           			dsize--;
       			}
       			else{
          			prev.next=temp.next;
          			dsize--;
       			}
		}

       		else
         		System.out.println("Element not found");
      		temp=null;
      		prev=null;
   		
 	}
}

class SortedChainDriver1{
	public static void main(String[] args) throws Exception{
		int option;
     		Integer rno;
     		String name;
     		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     		SortedChain<Integer,String>sc=new SortedChain<Integer,String>();
     		Pair<Integer,String> p1;
     		do{
   			System.out.println("SORTED CHAIN DICTIONARY OPERATIONS");
   			System.out.println("1.INSERT");
   			System.out.println("2.DELETE");
   			System.out.println("3.FIND");
   			System.out.println("4.SIZE");
   			System.out.println("5.DISPLAY");
   			System.out.println("ENTER OPERATION NUMBER");
   			option=Integer.parseInt(br.readLine());
   			switch(option){
   				case 1:	System.out.println("Enter an entry details..i.e Key type is Integer and Value type is String");
   	     				rno=Integer.parseInt(br.readLine());
   	     				name=br.readLine();
   	     				p1=new Pair<Integer,String>(rno,name);
             				sc.insert(p1);
             				break;
     				case 2:	System.out.println("Enter key");
     	 				rno=Integer.parseInt(br.readLine());
        				sc.delete(rno);
        				break;
     				case 3:	Pair<Integer,String> e;
        				System.out.println("Enter key");
        				rno=Integer.parseInt(br.readLine());
        				e=sc.find(rno);
        				if(e==null){
						System.out.println("Key is not present in the dictionary");
					}
        				else
						System.out.println(e);
        				break;
    				case 4:	System.out.println("Size of dictionay: "+sc.size());
         				break;
     				case 5:	sc.display();
         				break;
     				case 6:	System.exit(0);
			}
    		}while(option<=6);
	}
}