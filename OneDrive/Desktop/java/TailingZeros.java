
import java.util.*;
public class TailingZeros {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    
    static int tailingZeros(int n){
        
        int res = 0;
        int powerof5 = 5;
        while(n>=powerof5){
            res += (n/powerof5);
            powerof5 *= 5;
        }
        return res;
        
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(tailingZeros(n));
    }
}

