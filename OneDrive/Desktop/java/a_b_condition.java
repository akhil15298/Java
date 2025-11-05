import java.util.*;
public class a_b_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("equal");
        }else{
            if(a>b){
                System.out.println("a is greaterthan b");
            }
            System.out.println("a is lessthan b");
        }
        
    }
    
}
