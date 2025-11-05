import java.util.*;

public class powerofNum {

    public static long pow(int x,int y){

        if(y == 0){
            return 1;
        }
        if(y %2 ==0){
            long res = pow(x,y/2);
            return res * res;
        }else{
            return pow(x,y-1)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(pow(x, y));
    }
    
}
