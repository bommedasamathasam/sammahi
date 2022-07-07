import java.util.*;
class  Employee implements Comparable<Employee>{
	Integer id;
	Double sal;
	Employee(int i,double s){
		this.id=i;
		this.sal=s;
	}
public int compareTo(Employee e1){
	return this.sal.compareTo(e1.sal);
	}
public String toString(){
	return "Id: "+id+" Sal: "+sal;
	}
}
class EmployeeSortedSetDemo{
	public static void main(String[] args){
		Employee e1=new Employee(1,10000.0);
		Employee e2=new Employee(3,20000.0);
		Employee e3=new Employee(4,50000.0);
		Employee e4=new Employee(5,40000.0);
		Employee e5=new Employee(2,20000.0);
		TreeSet<Employee> s=new TreeSet<Employee>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		Iterator<Employee> itr=s.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
	}
	System.out.println("Details of minimum salaried Employee are "+s.first());
	System.out.println("Details of maximum salaried Employee are "+s.last());
	System.out.println("Details of maximum salaried Employee are "+s.higher(new Employee(0,30000)));
}
}