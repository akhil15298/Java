import java.util.Scanner;

import java.util.*;

public class LuckyNumber {
    
    public static boolean isluckynum(int n, int counter){
        if(n<counter){
            return true;
        }
        if(n % counter ==0){
            return false;
        }

        return isluckynum(n - (n/counter), counter +1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = sc.nextInt();

        System.out.println(isluckynum(n, counter));
    }
}
