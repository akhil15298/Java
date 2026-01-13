import java.util.Stack;


public class stackdemo {
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(40);
        s.add(40); //adds at bottom

        System.out.println(s);

        System.out.println(s.peek()); //top element

        System.out.println(s.pop()); //removes top element

        System.out.println(s);

        System.out.println(s.search(40)); //returns position from top
    }
}
