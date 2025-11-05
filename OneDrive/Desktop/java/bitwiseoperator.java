import java.util.*;

public class bitwiseoperator {

    static String D2B(int n){
        String b = "";
        while(n>=1){
            int last = n%2;
            n/=2;
            b = last+b;
        }
        return b;
    }
    static int B2D(String b){
        int res = 0;
        int powerof2 = 1;
        for(int i = b.length() -1;i>=0;i--){
            if(b.charAt(i) == '1'){
                res = res + powerof2;
            }
            powerof2*=2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(D2B(n));
        String y = D2B(n); 
        System.out.println(B2D(y));
    }
    
}
