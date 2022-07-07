import java.util.*;
class HallBooking{
public static void main(String[] args)
    {
        HashMap<String,Double> hm=new HashMap<String,Double>();
        hm.put("SwagathGrand Alkapuri",new Double(50000));
        hm.put("SangeethaGrand DSNR",new Double(75000));
        hm.put("Rose Star",new Double(40000));
	Set<Map.Entry<String,Double>> myset=hm.entrySet();
	for(Map.Entry<String,Double> me:myset){
	System.out.print(me.getKey()+":");
	System.out.println(me.getValue());
	}
        Double maxValueInMap=(Collections.max(hm.values()));  
        for (Map.Entry<String, Double> entry : hm.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey()+" "+entry.getValue());  
            }
        }

    }
}