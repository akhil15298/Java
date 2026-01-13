import java.util.HashMap;

public class MapDemo {
    
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "One"); 
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        System.out.println(map);
        System.out.println("Value for key 2: " + map.get(2)); // Accessing value for key 2
        map.put(2,"five"); // Updating value for key 2
        System.out.println("Updated Map: " + map);
        map.remove(3); // Removing key 3
        System.out.println("After removing key 3: " + map);
        for(Integer key : map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        map.size(); // Returns the number of key-value mappings in this map
        System.out.println("Size of the map: " + map.size());
        map.hashCode(); // Returns the hash code value for this map
        System.out.println("Hash code of the map: " + map.hashCode());
        map.replace(4, "seven");
        System.out.println("After replacing key 4: " + map);
        map.put(3, "Three");
        map.put(5, "Five");
        System.out.println("Final Map: " + map);
        map.put(null, "NullKey"); // Adding a null key
        map.put(6, null); // Adding a null value
        System.out.println("Map after adding null key and null value: " + map);
    }
}
