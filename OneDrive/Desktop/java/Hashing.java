import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> list = new ArrayList<>();
        int x = sc.nextInt();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //search
        if(set.contains(x)){
            System.out.println("set contains " + x);
        }else{
            System.out.println("does not contains " + x);
        }
        //delete
        set.remove(x);
        //size
        System.out.println(set.size());
        //print all elements
        System.out.println(set);
        //iterator
        Iterator it = set.iterator();
        //hasnext,next
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
