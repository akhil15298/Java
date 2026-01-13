import java.util.TreeSet;

public class treesetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(30);
        ts.add(10);
        ts.add(20);
        ts.add(40);
        ts.add(5);
        ts.add(35);
        // ts.add(null); // This line will cause a NullPointerException since TreeSet does not allow null values
        System.out.println(ts); // Output will be in sorted order: [10, 20, 30, 40]

        for(Object obj : ts){
            System.out.println(obj);
        }
        ts.hashCode(); // Returns the hash code value for this set
        System.out.println(ts.hashCode());
        ts.ceiling(25); // Returns the least element greater than or equal to 25
        ts.floor(25);   // Returns the greatest element less than or equal to 25
        System.out.println(ts.ceiling(25));
        System.out.println(ts.floor(25));
       
    }
}
