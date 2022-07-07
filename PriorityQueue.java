import java.util.Scanner;
public class PriorityQueue<T extends Comparable<T>>{
    T heap[];
    int noOfElements;
    
	PriorityQueue(T[] heap) {
		this.heap = heap;
		noOfElements=0;
	}
    void enqueue(T newele)
    {
    	noOfElements++;
    	int newelepos=noOfElements;
    	while(newelepos>1 && heap[newelepos/2].compareTo(newele)<0)
    	{
    		
    		heap[newelepos]=heap[newelepos/2];
    		newelepos=newelepos/2;
    		
    	}
    	heap[newelepos]=newele;
    	
    }
    void dequeue()
    {
    	T lastele=heap[noOfElements--];
    	int parent=1;
    	int child=2;
    	while(child<=noOfElements)
    	{
    		if(heap[child].compareTo(heap[child+1])<0)
    		{
    			child++;
    		}
    		if(heap[child].compareTo(lastele)>0)
    		{
    			heap[parent]=heap[child];
    			parent=child;
    			child=child*2;
    		}
    		else
    		{
    			break;
    		}
    	
    		
    	}
    	heap[parent]=lastele;		
    	
    }
    	void display()
    	{
    		if(noOfElements==0)
    		{
    			System.out.println("Priority Queue is empty");
    			return;
    		}
    		System.out.println("Heap elements are:");
    		for(int i=1;i<=noOfElements;i++)
    		{
    			System.out.print(heap[i]+" ");
    		}
    		System.out.println();
    	}
    	
    	
    	void topEle()
    	{
    		if(noOfElements==0)
    		{
    			System.out.println("Priority Queue is empty");
    			return;
    		}
    		System.out.println("Top element is :"+heap[1]);
    	}
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		n=n+1;
		Integer a[]=new Integer[n];
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(a);
		while(true)
		{
		System.out.println("1.Insert\n2.Delete\n3.Top element\n4.Display\n5.Exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Enter the element to be inserted");
				pq.enqueue(sc.nextInt());
				break;
		case 2:pq.dequeue();
				break;
		case 3: pq.topEle();
				break;
		case 4: pq.display();
				break;
		case 5: System.exit(0);
		}
		}

	}

}