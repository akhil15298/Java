import java.util.*;
import java.util.Arrays;
public class StackAL
{
    /*static class Stack{
        //public static Node head;
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return list.get(list.size()-1);
        }
    }*/
	public static void main(String[] args) {
	    Stack<Integer> st = new Stack<>();
	    st.push(1);
	    st.push(2);
	    st.push(3);
	    st.push(4);
	    //st.push(5);
	    //st.push(6);
	    while(!st.isEmpty()){
	        System.out.println(st.peek());
	        st.pop();
	    }
		//System.out.println("Hello World");
	}
}


