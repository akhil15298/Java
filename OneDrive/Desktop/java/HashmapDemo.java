import java.util.HashMap;
import java.util.Set;
//import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

import java.util.Map;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class HashmapDemo {

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(5,20);
        hm.put(4, 16);
        System.out.println(hm.get(5));
        hm.put(12,"akhil");
        hm.put(5,25); 
        //duplicate key will update the original value

         System.out.println(hm);
         System.out.println(hm.containsKey(6));
            System.out.println(hm.containsValue(16));
            System.out.println(hm.get(5));
            System.out.println(hm.putIfAbsent(6,36));

           //Method 1 to iterate
            for(Object key : hm.keySet()){
                System.out.println(key + " : " + hm.get(key));
            }


        Set hm1 = hm.entrySet();
        Iterator itr = hm1.iterator();
        while(itr.hasNext()){   
            System.out.println(itr.next());
        }   

   
       
    }
    
}
