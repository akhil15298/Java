import java.util.LinkedList;




public class LinkedListDemo {

    public static void main(String[] args) {
       
    LinkedList list = new LinkedList();
    list.add("A");
    list.add("B");
    list.add("C");

    for (Object obj : list) {
        System.out.println(obj);
    }  
    
    
    System.out.println("First Element: " + list.getFirst());
    System.out.println("Last Element: " + list.getLast());
    list.addFirst("Start");
    list.addLast("End");
    System.out.println("After Adding Elements:");
    for (Object obj : list) {   
        System.out.println(obj);
    }   

    list.removeFirst();
    list.removeLast();      
    System.out.println("After Removing Elements:");
    for (Object obj : list) {
        System.out.println(obj);
    }

    }

    
}
