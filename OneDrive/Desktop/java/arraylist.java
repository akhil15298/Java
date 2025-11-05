//array -premative(int,float),continious memory,fixed size.if there is no continious memory means no array.
//arraylistnoncontinious,not fixed,objects(stack,heap)
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;;
class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            list.add(sc.nextInt());
        }
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get element
        int ele = list.get(x);
        System.out.println(ele);
        //add ele in between
        list.add(y,z);
        System.out.println(list);
        //set element
        list.set(x,z);
        System.out.println(list);
        //delete element
        list.remove(x);
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println(size);
        

        for(int i = 0;i<size;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
    
}
