import java.util.*;

public class josephus {

    static int josephusproblem(int n,int k){
        if(n == 1){
            return 0;
        }
        return ((josephusproblem(n-1, k) +k)%n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(josephusproblem(n, k));
    }
    
}
