import java.util.*;
class TestSort{
public static void main(String args[]){
	ArrayList<String> al=new ArrayList<String>();
	al.add("sam");
	al.add("Ajju");
	al.add("sampada");
	al.add("sunny");
	Collections.sort(al,Collections.reverseOrder());
	Iterator i=al.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
  }
}