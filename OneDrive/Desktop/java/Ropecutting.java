import java.util.*;

public class Ropecutting {

    static int maxpieces(int n,int a,int b,int c){
        int pieces = 0;

        if(n == 0){
            return 0;
        }else if(n < 0){
            return 0;

        }
        int temp1 = maxpieces(n-a, a, b, c);
        int temp2 = maxpieces(n-b, a, b, c);
        int temp3 = maxpieces(n-c, a, b, c);
        pieces = Math.max(temp3,Math.max(temp1,temp2));

        if(pieces == -1){
            return -1;
        }else{
            return pieces + 1;
        }

    }

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        System.out.println(maxpieces(15,5,7,8));
    }
    
}
