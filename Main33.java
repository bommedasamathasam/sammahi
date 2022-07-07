import java.util.*;
public class Main33
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Map<String,String> students=new HashMap<String,String>();
        Integer choice;
        String name,grade;
        System.out.println("1) add student\n2)remove student\n3)display\n4) quit");
        do 
        {
            System.out.println("enter your choice");
            choice=Integer.valueOf(sc.nextLine());
            switch(choice)
            {
                case 1 : System.out.println("enter student name and grade");
                        name=sc.nextLine();
                        grade=sc.nextLine();
                            students.put(name,grade);
                            System.out.println("student added");
                        
                        break;
                
                case 2 : System.out.println("enter student to remove");
                        name=sc.nextLine();
                        if (students.containsKey(name))
                        {
                            students.remove(name);
                            System.out.println(name + " removed");
                        }
                        else System.out.println("student doesnt exist");
                        break;
                    
                case 3 : System.out.println("students are :");
                        for (String s : students.keySet())
                            System.out.println(s+": "+students.get(s));
                        break;
                    
                case 4 : break;
            }
        }while(choice!=4);
    }
}