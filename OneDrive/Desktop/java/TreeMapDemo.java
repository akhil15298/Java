import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        TreeMap map2 = new TreeMap();

        map.put(3, "Three");
        map.put(1, "One");      
        map.put(2, "Two");
        map.put(4, "Four"); 
        map.put(5, "Five");
        System.out.println("TreeMap in sorted order: " + map);
        System.out.println(map.ceilingEntry(0));
        System.out.println(map.ceilingEntry(6));
        map2.put("three",3);
        map2.put("one",1);  
        map2.put("two",2);
        map2.put("four",4);
        map2.put("five",5);
        System.out.println("TreeMap in sorted order: " + map2); 

        System.out.println(map.get(3));
        System.out.println(map.headMap(4));//keys less than 4
        System.out.println("Tail map"+ map.tailMap(3));//keys greater than or equal to 3
        System.out.println("map.higherEntry(0): " + map.higherEntry(0));
        System.out.println("map.higherEntry(5): " + map.higherEntry(5));
        System.out.println("map.keySet(): " + map.keySet());
        System.out.println("map.pollFirstEntry(): " + map.pollFirstEntry());
        System.out.println("After polling first entry: " + map);
        System.out.println("removing key 3: " + map.remove(3));
        System.out.println("After removing key 3: " + map);
        map.put(2,"Two Updated");
        System.out.println("After updating key 2: " + map); 
        System.out.println("Size of the map: " + map.size());
        System.out.println(map.subMap(1, 5));
    }
    
}
