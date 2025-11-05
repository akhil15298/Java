import java.util.*;

public class RightMostSetbit {

    static int sebitRightmost(int n){
        int mask = 1;
        int pos = 1;

        if(n == 0){
            return -1;

        }
        while((n & mask) == 0){
            mask = mask <<1;
            pos++;
        }
        return pos;
    }

    static int efficientRM(int n){
        return (int)(Math.log(n ^ (n &(n-1)))/Math.log(2)) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sebitRightmost(n));
        System.out.println("----------------Efficient Way");
        System.out.println(efficientRM(n));
    }
    
}
