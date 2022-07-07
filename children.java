import java.util.*;
import java.io.*;
public class children {
    public static void main(String args[])
    {
        try {
        Set<String> ts1 = new HashSet<>();
        ts1.add("Ayush");
        ts1.add("Azaan");
        ts1.add("Bahadur");
        ts1.add("Balhar");
        ts1.add("Chakradar");
        ts1.add("Chakradev");
        ts1.add("Devansh");
        ts1.add("Vishnu");
        Set<String> ts2 = new HashSet<>();
  
        ts2.add("Balvan");
        ts2.add("Balveer");
       ts2.add("Banjeet");
        ts2.add("Chakradar");
        ts2.add("Chakradev");
        ts2.add("Devansh");

        Set<String> union = new HashSet<String>();
    union.addAll(ts1);
    union.addAll(ts2);
         System.out.println("who can eat either Cookies or Banana Chips "+union);


       Set<String> intersection = new HashSet<String>();
    intersection.addAll(ts1);
    intersection.retainAll(ts2);
     System.out.println("who can eat Cookies & Banana Chips "+intersection);

        Set<String> difference = new HashSet<String>();
    difference.addAll(ts1);
    difference.removeAll(ts2);
    System.out.println("who can eat only Cookies "+difference);
     }
  
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}