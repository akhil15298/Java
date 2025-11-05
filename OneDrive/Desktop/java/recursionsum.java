import java.util.*;
public class recursionsum {
    public static int printsum(int n) {
        if(n<0){
            return -1;
        }
        if(n!=0){
            return n+printsum(n-1);
        }else{
            return n;
        }
    }
    public static int factorial(int n) {
        if(n<0){
            return -1;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);   
    }
    public static int fibonacci(int n) {
        if(n<0){
            return -1;
        }
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
        
        
    }
    public static int powerofx(int x,int n) {
        if(n<0){
            return -1;
        }
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return x*powerofx(x, n-1);
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(printsum(n));
        System.out.println(factorial(n));
        for(int i = 0;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
        System.out.println(powerofx(x, n));
        
    }

    
}
