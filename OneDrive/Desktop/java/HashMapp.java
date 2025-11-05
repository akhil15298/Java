import java.util.HashMap;
import java.util.Set;
import java.util.*;
/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sortloc {

  public static void main(String[] args) {
     System.out.println("Manoprabu.R");
       ArrayList<String> name = new ArrayList<String>();
       ArrayList<String> location = new ArrayList<String>();
    HashMap<String,String> myMap = new HashMap<>();

        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your Name: ");
            name.add(sc.nextLine());
            System.out.println("Please enter your Location: ");
            location.add(sc.nextLine());
            myMap.put(name.get(0),location.get(0));
            name.clear();
            location.clear();
            System.out.println(myMap);
        }
  }
}*/
public class HashMapp {
    public static void main(String[] args) {
        HashMap<String,String> book = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); 
        book.put("akhil","9494313996");
        book.put("nikhil","9491513759");
        book.put("lahari","9381495276");
        //book.put("akhil","");
        //System.out.println(book.get("akhil")); 
        //search
        if(book.containsKey(x)){
            System.out.println("key is :" + book.get(x));
        
        }else{
            System.out.println("not present");
        }
        //method -1 to print all elements
        Set<String> keys = book.keySet();
        for(String i: keys){
            System.out.println(i + " : "  + book.get(i));


        }
        System.out.println();
        //Method-2 to print all elements
        Set<Map.Entry<String,String>> values = book.entrySet();
        for(Map.Entry<String,String>e : values){
            System.out.println(e.getKey() + " : " + e.getValue());
            //e.setValue("III");
        } 
    }
}
