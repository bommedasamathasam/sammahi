import java.util.*;
interface Stack1<T>{
	void push(T x);
	T pop();
	T topElement();
	boolean isStackEmpty();
	boolean isStackFull();
}

class Node<T>{
	T data;
	Node<T> next;
	Node(T d,Node<T> n){
		data=d;
		next=n;
	}
}

class LinkedStack<T> implements Stack1<T>{
	Node<T> top;
	LinkedStack(){
		top=null;
	}
public boolean isStackFull(){
	return false;
	}
public boolean isStackEmpty(){
	return(top==null);
	}
public void push(T x){
	Node<T> temp=new Node<T>(x,top);
	top=temp;
	}
public T pop(){
	if(isStackEmpty()){
		System.out.println("Stack is Empty");
		return null;
	}
	else{
		T y=top.data;
		top=top.next;
		return y;
	}
}
public T topElement(){
	if(isStackEmpty())
		return null;
	else
		return top.data;
}
void display(){
	if(isStackEmpty())
		System.out.println("Stack is Empty");
	else{
		Node<T> temp=top ;
		System.out.println("Elements of Stack");
		while(temp!=null){
			temp=top.next;
			System.out.println(top.data);
			top=temp;
		}
	}
   }
}

class LinkedStackDemo{
	public static void main(String args[]){
		LinkedStack<Integer> iso=new LinkedStack<Integer>();
		Integer k=iso.topElement();
		if(k!=null)
		System.out.println("Top Elements is:"+k);	
		iso.push(10);
		iso.push(20);
		iso.push(30);	
		iso.display();
		Integer i=iso.pop();
		if(i!=null)
			System.out.println("Popped Element is:"+i);
		Integer j=iso.topElement();
		if(j!=null)
			System.out.println("Top Elements is:"+j);
		iso.display();
		LinkedStack<String> sso=new LinkedStack<String>();
		String s1=sso.topElement();
		if(s1!=null)
		System.out.println("Top Elements is:"+s1);	
		sso.push("abc");
		sso.push("def");
		sso.push("ghi");	
		sso.display();
		String s2=sso.pop();
		if(s2!=null)
			System.out.println("Popped Element is:"+s2);
		String s3=sso.topElement();
		if(s3!=null)
			System.out.println("Top Elements is:"+s3);
		sso.display();
	}
}