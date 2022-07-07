import java.util.Scanner;
class NonGen
{
  int i;
  NonGen(int x)
  {
   i=x;
  }
}
 class GenSub2 <T> extends NonGen
 {
  T ob1;
  GenSub2(int y,T O1)
  {
   super(y);
   ob1=O1;
  }
   T getob1()
  {
   return ob1;
  }
}
class GenHierarchy2
{
  public static void main(String[] args)
  {
   GenSub2<Integer>igh=new GenSub2<Integer>(10,5);
   System.out.println("i of igh="+igh.i);
   System.out.println("ob1 of igh="+igh.getob1());
   GenSub2<String>sgh=new GenSub2<String>(5,"Hello");
   System.out.println("i of sgh="+sgh.i);
   System.out.println("ob1 of sgh="+sgh.getob1());
  }
}
   