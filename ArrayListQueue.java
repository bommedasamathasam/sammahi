import java.util.*;
class ArrayListQueue<T>{
	ArrayList<T> alq;
	ArrayListQueue(){
		alq=new ArrayList<T>();
	}
	public void enqueue(T ele){
		alq.add(alq.size(), ele);
	}
	public T dequeue() {
		T obj=null;
		if(isEmpty())
			System.out.println("Queue is Empty");
		else {
			obj=alq.get(0);
			alq.remove(0);
			
		}
		return obj;
	}
	public void display() {
		if(alq.isEmpty())
			System.out.println("Queue is Empty");
		else {
			System.out.println("Queue Elements are ");
			Iterator <T> itr= alq.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
	
		}
	}
	public T rearElement() {
		T obj=null;
		if(isEmpty())
			System.out.println("Queue is Empty");
		else {
			obj=alq.get(alq.size()-1);
		}
		return obj;
	}
	public T frontElement() {
		T obj=null;
		if(isEmpty())
			System.out.println("Queue is Empty");
		else {
			obj=alq.get(0);
		}
		return obj;
	}
	public boolean isFull() {
		return false;
	}
	public boolean isEmpty() {
		return alq.size()==0;
	}
}
class ArrayListQueueDemo {

	public static void main(String[] args) {
		ArrayListQueue<String> a=new ArrayListQueue<String>();
		a.enqueue("abc");
		a.enqueue("efg");
		a.enqueue("hij");
		a.enqueue("klm");
		a.enqueue("nop");
		a.display();
		System.out.println("Removed Element is "+a.dequeue());		
		System.out.println("Array List Elements after removing ");
		a.display();
		System.out.println("Front Element is "+a.frontElement());
		System.out.println("Rear Element is "+a.rearElement());
		
	}

}
