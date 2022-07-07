import java.util.*;
interface MyStack<T>{
 void push(T x);
 T pop();
 T topElement();
 void display();
 boolean isFull();
 boolean isEmpty();
}
class LinkedListStack<T> implements MyStack<T> {
	LinkedList<T> lcs;
	LinkedListStack(){
		lcs=new LinkedList<T>();
	}
	public void push(T ob) {
		lcs.addFirst(ob);
		
	}
	
	public T pop() {
		T ob=null;
		if(!lcs.isEmpty()) {
			ob=lcs.getFirst();
			lcs.removeFirst();
		}
		else
			System.out.println("Stack is empty");
		return ob;
	}
	public T topElement() {
		T ob=null;
		if(!lcs.isEmpty()) {
			ob=lcs.getFirst();
		}
		return ob;
	}
	public void display() {
		if(lcs.isEmpty())
			System.out.println("Stack is Empty");
		else {
			System.out.println("Stack Elements are ");
			Iterator <T> itr= lcs.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
	
		}
	}
	
	
	public boolean isEmpty() {
		
		return lcs.size()==-1;
	}
	public boolean isFull() {
		
		return false;
	}
	
}
class LinkedListStackDemo {

	public static void main(String[] args) {
		LinkedListStack<String> l=new LinkedListStack<String>();
		l.push("abc");
		l.push("def");
		l.push("ghi");
		l.push("jkl");
		l.push("mno");
		l.display();
		System.out.println("Popped Element is "+l.pop());
		l.display();
		System.out.println("Top Element is "+ l.topElement());
	}

}