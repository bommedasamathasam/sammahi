interface Stack<T>{
 void push(T x);
 T pop();
 T topElement();
 boolean isStackFull();
 boolean isStackEmpty();
}

class ArrayStack<T> implements Stack<T>{
T[] a;
int top;
int size;
ArrayStack(T[] x){
a=x;
size=x.length;
top=-1;
  }
public boolean isStackFull(){
if(top==size-1){
return true;
}
else
return false;
  }
public boolean isStackEmpty(){
return (top==-1);
 }
public void push(T z){
if(isStackFull()){
System.out.println("Stack is Full");
}
else
a[++top]=z;
  }
public T pop(){
if(isStackEmpty()){
System.out.println("Stack is Empty");
return null;
}
else{
return (a[top--]);
 }
}
public T topElement(){
if(isStackEmpty()){
return null;
            }
        else{
     return (a[top]);
    }
}
void display(){
if(isStackEmpty()){
System.out.println("Stack is Empty");
}
else{
System.out.println("Stack contains are");
for(int i=top;i>=0;i--){
System.out.println(a[i]);
    }
    }
 }
}

class StackMain{
public static void main(String args[]){
Integer[] inum=new Integer[5];
ArrayStack<Integer> iso=new ArrayStack<Integer>(inum);
Integer x=iso.topElement();
iso.push(10);
iso.push(20);
iso.push(30);
iso.display();
Integer i;
i=iso.pop();
if(i!=null){
System.out.println("Popped Element is "+i);
}
        Integer j;
j=iso.topElement();
if(j!=null){
System.out.println("Top Element is "+j);
}
iso.display();
String[] s=new String[5];
ArrayStack<String> sgo=new ArrayStack<String>(s);
sgo.push("abc");
sgo.push("def");
sgo.push("ghi");
sgo.display();
String s1;
s1=sgo.pop();
if(s1!=null){
System.out.println("Popped Element is "+s1);
}
String s2;
s2=sgo.topElement();
if(s2!=null){
System.out.println("Top Element is "+s2);
}
sgo.display();
 }
}


