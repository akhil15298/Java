import java.util.*;
public class firstandlast {
    public static int first = -1;
    public static int last = -1;
    public static void firstandlastelement(String s,int idx,char ele) {
        if(idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = s.charAt(idx);
        if(curr == ele){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
            
        }
        firstandlastelement(s, idx+1, ele);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = 0;
        char ele = sc.next().charAt(0);
        //System.out.println(s.length());
        firstandlastelement(s, idx, ele); 
        
    }
}
