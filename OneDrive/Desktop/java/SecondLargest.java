import java.util.*;

public class SecondLargest {

    public static int sec(int[] a){
        int max1= 0,max2 = 0;
        if(a[0] > a[1]){
            max1 = a[0];
            max2 = a[1];
        }else{
             max1 = a[1];
            max2 = a[0];
        }

        for(int i =2;i<a.length;i++){
            if(a[i] >max1){
                max2 = max1;
                max1 =  a[i];
            }else if(a[i] > max2){
                max2 = a[i];
            }
        }
        return max2;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        } 
        //int[] a = {1,2,3,4,5};
        System.out.println(sec(a));
    }
}
