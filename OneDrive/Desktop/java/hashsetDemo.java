import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class hashsetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);//Duplicates should not be added
        hs.add(40);
        //hs.put(50); // This line will cause a compile-time error since HashSet does not have a put method
        hs.add("Hello");
        hs.add(null); // HashSet allows one null value
        hs.add(60.55);
        hs.add(true);
        System.out.println(hs);

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
         
    }
}
