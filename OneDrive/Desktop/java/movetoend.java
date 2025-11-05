import java.util.*;
public class movetoend {
    public static void move(String s,int idx,char ele) {
        if(idx>=s.length()){
            return;
        }
        char curr = s.charAt(idx);
        if(curr!=ele){
            System.out.print(curr);
        }
        move(s, idx+1, ele);
        if(curr == ele){
            System.out.print(curr);
        }
        return;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = 0;
        char ele = sc.next().charAt(0);
        move(s, idx, ele);
        
    }
}
