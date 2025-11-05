import java.util.Scanner;

public class GCD {

    static int euclidgcd(int a,int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }

    static int  optimisedgcd(int a,int b){

        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;

            }else{
                b = b%a;
            }
        }
        if(a!=0){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Euclid Algo");
        System.out.println(euclidgcd(a,b));
        System.err.println("Optimised Algo");
        System.out.println(optimisedgcd(a, b));
    }

    
    
}
