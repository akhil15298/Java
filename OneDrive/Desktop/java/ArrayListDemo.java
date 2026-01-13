import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        
        
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        List l2 = new ArrayList();
        l2.add(40);
        l2.add("Akhil");
        l2.add("sdbf");

        ListIterator itr2 = l2.listIterator(l2.size());
        while(itr2.hasPrevious()) {
            System.out.println(itr2.previous());
        }
    }
    
}
