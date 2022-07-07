import java.util.*;
//Using collections

interface MyQueue<T> {
	void enqueue(T ele);
	T dequeue();
	T frontElement();
	T rearElement();
	boolean isEmpty();
	boolean isFull();
}

class LinkedListQueue<T> implements MyQueue<T>{
	LinkedList<T> lcq;
	LinkedListQueue(){
		lcq=new LinkedList<T>();
	}
	public void enqueue(T ele) {
		lcq.addLast(ele);
	}
	public T dequeue() {
		T obj=null;
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			obj=lcq.getFirst();
			lcq.removeFirst();
		}
		return obj;
	}
	public T frontElement() {
		T ob=null;
		if(!lcq.isEmpty()) {
			ob=lcq.getFirst();
		}
		return ob;
	}
	public T rearElement() {
		T ob=null;
		if(!lcq.isEmpty()) {
			ob=lcq.getLast();
		}
		return ob;
		
	}
	public boolean isEmpty() {
		return lcq.size()==-1;
		
	}
	public boolean isFull() {
		return false;
	}
	public void display() {
		if(lcq.isEmpty())
			System.out.println("Queue is Empty");
		else {
			System.out.println("Queue Elements are ");
			Iterator <T> itr= lcq.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
	
		}
	}
}
public class LinkedListQueueDemo {

	public static void main(String[] args) {
		LinkedListQueue<String> a=new LinkedListQueue<String>();
		a.enqueue("Namitha");
		a.enqueue("Madhavi");
		a.enqueue("Sampada");
		a.enqueue("Jagruthi");
		a.enqueue("Sampada");
		a.display();
		System.out.println("Removed Element is "+a.dequeue());		
		System.out.println("Array List Elements after removing ");
		a.display();
		System.out.println("Front Element is "+a.frontElement());
		System.out.println("Rear Element is "+a.rearElement());
		

	}

}