import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo  {
    public static void main(String[] args) throws Exception {
        

        Set s1 = new HashSet();
        s1.add(10);
        s1.add(20);
        s1.add(30); 
        s1.add(40);
        s1.add(10);
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
