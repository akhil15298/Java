import java.util.*;
public class revlinkedlist_iterative {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        //public Node(revlinkedlist_iterative.Node data2) {
        //}

    }
    /**
     * @param data
     */
    public void addlast(int data) {
        Node newnode = new Node(data);
        //revlinkedlist_iterative.Node head;
        if(head == null){
            head = newnode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newnode;
        
    }
    public void print() {
        if(head == null){
            System.out.println("list is null");
            return;
        }
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("NULL");
        
    }
    public static void iteration() {
        if(head == null || head.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;

        }
        head.next = null;
        head = prev;

        
    }
    public static void main(String args[]) {
        revlinkedlist_iterative ll = new revlinkedlist_iterative();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
        ll.iteration();
        ll.print();


        
    }
    
}
