import java.util.*;

interface Queue<T>{
	void enqueue(T x);
	T dequeue();
	boolean isQueueFull();
	boolean isQueueEmpty();
	T frontElement();
	T rareElement();
}

class Node<T>{
	T data;
	Node<T> next;
	Node(T d,Node<T> n){
		data=d;
		next=n;
	}
}


class LinkedQueue<T> implements Queue<T>{
	Node<T> front,rear;
	LinkedQueue(){
		front=null;
		rear=null;
}
public boolean isQueueFull(){
	return false;
	}
public boolean isQueueEmpty(){
	return(front==null);
	}
public void enqueue(T x){
	Node<T> temp=new Node<T>(x,null);
	if(front==null&&rear==null)
		front=rear=temp;
	else{
		rear.next=temp;
		rear=temp;
	}
}
public T dequeue(){
	if(isQueueEmpty()){
		System.out.println("QUEUE IS EMPTY");
		return null;
	}
	else{
		T y=front.data;
		front=front.next;
		if(front==null)
			rear=null;
		return y;
		}
}
void display(){
	if(isQueueEmpty())
		System.out.println("QUEUE IS EMPTY");
	else{
	Node<T> temp=front;
	System.out.println("Elements in Queue are :");
	while(temp!=null){
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println("");
	System.out.println("");
    }
}
public T frontElement(){
	if(isQueueEmpty()){
		System.out.println("QUEUE IS EMPTY");
		return null;
	}
	else{
		return front.data;
		}
}
public T rareElement(){
	if(isQueueEmpty()){
		System.out.println("QUEUE IS EMPTY");
		return null;
	}
	else{
		return rear.data;
		}
}
}

class QueueLinkedMain{
	public static void main(String[] args){
		LinkedQueue<Integer> iso=new LinkedQueue<Integer>();
		Integer f=iso.frontElement();
		if(f!=null)
			System.out.println("Front Element is: "+f);	
		iso.enqueue(10);
		iso.enqueue(20);
		iso.enqueue(30);	
		iso.display();
		Integer i=iso.dequeue();
		if(i!=null)
			System.out.println("Dequeued Element is: "+i);
		Integer f1=iso.frontElement();
		if(f1!=null)
			System.out.println("Front Element is: "+f1);
		Integer r1=iso.rareElement();
		if(r1!=null)
			System.out.println("Rear Element is: "+r1);
		iso.display();
		LinkedQueue<String> sso=new LinkedQueue<String>();
		String s1=sso.frontElement();
		if(s1!=null)
		System.out.println("Front Elements is:"+s1);	
		sso.enqueue("abc");
		sso.enqueue("def");
		sso.enqueue("ghi");	
		sso.display();
		String s2=sso.dequeue();
		if(s2!=null)
			System.out.println("Dequeued Element is:"+s2);
		String f2=sso.frontElement();
		if(f2!=null)
		System.out.println("Front Elements is:"+f2);	
		String r2=sso.rareElement();
		if(r2!=null)
			System.out.println("Rear Elements is:"+r2);
		sso.display();
	}
}