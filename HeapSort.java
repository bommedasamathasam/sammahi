import java.util.*;
class HeapSort<T extends Comparable<T>>
{
	ArrayList<T> arr;
	int n;
	T temp;
	HeapSort(T[] A, int s)
	{
		arr = new ArrayList<>(s+1);
		arr.add(0, null);
		n = s;
		for(int i = 0; i < n; i++)
		{
			arr.add(i+1, A[i]);
		}
	}
	void hsort()
	{
		heapInitialize();
		heapExchange_Heapify();
		display();
	}
	void heapInitialize()
	{
		for(int i = n/2; i >= 1; i--)
		{
			heapify(arr, i, n);
		}
	}
	void heapExchange_Heapify()
	{
		for(int lastelepos = n; lastelepos > 1; lastelepos--)
		{
			temp = arr.get(1);
			arr.set(1, arr.get(lastelepos));
			arr.set(lastelepos, temp);
			heapify(arr, 1, lastelepos-1);
		}
	}
	void heapify(ArrayList<T> arr, int rootpos, int m)
	{
		temp = arr.get(rootpos);
		int parent = rootpos;
		int child = parent*2;
		while(child <= m)
		{
			if(child < m && arr.get(child).compareTo(arr.get(child+1))<0)
				child++;
			if(arr.get(child).compareTo(temp)>0)
			{
				arr.set(parent, arr.get(child));
				parent = child;
				child = child*2;
			}
			else
				break;
		}
		arr.set(parent, temp);
	}
	void display()
	{
		for(int i = 1; i <= n; i++)
		{
			System.out.print(arr.get(i)+"  ");
		}
	}
	public static void main(String[] a)
	{
		Integer[] A = new Integer[]{12, 52, 3, 45 ,56, 67, 78, 34, 44, 99};
		HeapSort<Integer> hs = new HeapSort<Integer>(A, 10);
		hs.hsort();
	}
}