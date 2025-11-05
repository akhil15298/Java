import java.util.*;
public class StackClass
{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return head.data;
        }
    }
	public static void main(String[] args) {
	    Stack st = new Stack();
	    st.push(1);
	    st.push(2);
	    st.push(3);
	    st.push(4);
	    st.push(5);
	    st.push(6);
	    while(!st.isEmpty()){
	        System.out.println(st.peek());
	        st.pop();
	    }
		//System.out.println("Hello World");
	}
}


