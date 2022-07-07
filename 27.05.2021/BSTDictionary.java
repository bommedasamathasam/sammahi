import java.util.*;
class Pair<K extends Comparable<K>,V>{
	K key;
	V value;
Pair(){}
Pair(K key,V value){
	this.key=key;
	this.value=value;
}
public String toString(){
	return "Key:"+key+ " Value:"+ value;
  }
}


class TreeNode<K extends Comparable<K>,V>{
	Pair<K,V> data;
	TreeNode<K,V> lchild;
	TreeNode<K,V> rchild;
TreeNode(){}
TreeNode(Pair<K,V> p,TreeNode<K,V> lchild,TreeNode<K,V> rchild){
	this.data=p;
	this.lchild=lchild;
	this.rchild=rchild;
  }
}

class BSTDictionary<K extends Comparable<K>,V>{
	TreeNode<K,V> Root;
	int dsize;
boolean isEmpty(){
	return Root==null;
}
int size(){
	return dsize;
}
void insert(Pair<K,V> p){
	TreeNode<K,V> nn=new TreeNode<K,V>(p,null,null);
	TreeNode<K,V> Parent=null;
	TreeNode<K,V> Child;
	if(isEmpty())
		Root=nn;
	else{
	    Child=Root;
	    while(Child!=null){
		Parent=Child;
		if(p.key.compareTo(Parent.data.key)>0)
			Child=Child.rchild;
		else
			Child=Child.lchild;
	  }
	if(p.key.compareTo(Parent.data.key)>0)
		Parent.rchild=nn;
	else
		Parent.lchild=nn;
    }
	dsize++;
}

void delete(K key){
	TreeNode<K,V> Parent=null;
	TreeNode<K,V> Child;
	TreeNode<K,V> ps;
	TreeNode<K,V> s;
	if(isEmpty()){
		System.out.println("Tree is Empty");
		return;
	}
	else
	{
	Child=Root;
	while(Child!=null && !key.equals(Child.data.key)){
		Parent=Child;
 		if(key.compareTo(Child.data.key)>0)
		Child=Child.rchild;
		else if(key.compareTo(Child.data.key)<0)
		Child=Child.lchild;
	}
	if(Child==null){
		System.out.println("Entry not found");
		return;
	}
	if(Child.lchild!=null && Child.rchild!=null){
		ps=Child;
		s=Child.lchild;
		while(s.rchild!=null){
			ps=s;
			s=s.rchild;
		}
		Child.data=s.data;
		Child=s;
		Parent=ps;
	}
	TreeNode<K,V> c;
	if(Child.lchild==null)
		c=Child.rchild;
	else
		c=Child.lchild;
	if(Child==Root)
		Root=c;
	else
	    if(Child==Parent.rchild)
		Parent.rchild=c;
	    else
		Parent.lchild=c;

    }
  
}
Pair<K,V> find(K key){
	TreeNode<K,V> Temp=Root;
	while(Temp!=null && !key.equals(Temp.data.key)){
	if(key.compareTo(Temp.data.key)>0)
		Temp=Temp.rchild;
		else if(key.compareTo(Temp.data.key)<0)
		Temp=Temp.lchild;
	}
	if(Temp!=null)
		return Temp.data;
	else
		return null;
}
void display(){
	if(isEmpty()){
		System.out.println("Tree is Empty");
		return;
	}
	System.out.println("Please Enter Trevaresal choice");
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Inorder");
	System.out.println("2.Preorder");
	System.out.println("3.Postorder");
	System.out.println("4.Exit\nEnter Your Choice:");
	int choice=sc.nextInt();
	switch(choice){
		case 1:inorder(Root);
			break;
		case 2:preorder(Root);
			break;
		case 3:postorder(Root);
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Entry");
			break;
	}
}
void inorder( TreeNode<K,V> Root){
		if(Root!=null){
			inorder(Root.lchild);
			System.out.println(Root.data);
			inorder(Root.rchild);
     }
}
void preorder(TreeNode<K,V> Root){
		if(Root!=null){
			System.out.println(Root.data);
			preorder(Root.lchild);
			preorder(Root.rchild);
     }
}
void postorder(TreeNode<K,V> Root){
		if(Root!=null){
			postorder(Root.lchild);
			postorder(Root.rchild);
			System.out.println(Root.data);
     }
  }
}

class BSTMain{
public static void main(String args[]){
	BSTDictionary<Integer,String> bst=new BSTDictionary<Integer,String>();
	Scanner sc=new Scanner(System.in);
	int choice;
	Integer key;
	String value;
	Pair<Integer,String> p;
	do{
	   System.out.println("BST DICTIONARY OPERATIONS");
	   System.out.println("1.Insert");
           System.out.println("2.Delete");
	   System.out.println("3.Find");
	   System.out.println("4.Display");
           System.out.println("Enter an operation you like to perform:");
	   choice=sc.nextInt();
	   switch(choice){
		case 1:
		    System.out.println("Enter the key:");
		    key=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Value:");
		    value=sc.nextLine();
		    p=new Pair<Integer,String>(key,value);
		    bst.insert(p);
		    break;
		case 2:
			System.out.println("Enter the key:");
			key=sc.nextInt();
			bst.delete(key);
			break;		
		case 3:
			System.out.println("Enter the key:");
			key=sc.nextInt();
			p=bst.find(key);
			if(p==null)
				System.out.println("Entry not found");
			else
				System.out.println("Entry found:Key :"+ p.key +" value :"+p.value);
			break;
		case 4:
			bst.display();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Ivalid Choice");
			break;
		}
       }while(true);
  }
}
		    












