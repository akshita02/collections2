import java.util.*;
class map {
  public static void main(String[] args) {
     Scanner Scan= new Scanner (System.in);
    HashMap<String, Integer> hm= new HashMap<String, Integer>();
         hm.put("Akshita", 461); 
        hm.put("Nidhi", 248); 
        hm.put("Neha", 245);
 if (hm.isEmpty())  
        { 
            System.out.println("HM is empty"); 
        } 
          
        else
        { 
            System.out.println(hm); 
        } 
   
  }
}