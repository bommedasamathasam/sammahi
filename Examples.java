import java.util.*;
import java.util.TreeMap;
class Examples{
public static void main(String args[]){
	TreeMap<Integer,String> std=new TreeMap<Integer,String>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println("Enter  Rollnumber and Name of "+(i+1)+" Student");
		int a=sc.nextInt();
		String b=sc.nextLine();
		std.put(a,b);
        }
	System.out.println("Original content of Tree Map: "+std);
	System.out.println("Keys Greater than equal to 20: "+std.ceilingEntry(20));
	System.out.println("Keys less  than equal to 12: "+std.floorEntry(12));
	System.out.println("Reverse order of Keys: "+std.descendingMap());
	System.out.println("Highest entry  40: "+std.higherEntry(40));
	System.out.println("Lowest entry to 12: "+std.lowerEntry(40));
	System.out.println("Strictly less than  15: "+std.headMap(15));
	System.out.println("First Entry of map "+std.firstEntry());
	System.out.println("First Entry of map "+std.lastEntry());
}}