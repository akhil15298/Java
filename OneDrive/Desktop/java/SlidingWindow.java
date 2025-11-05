import java.util.*;

public class SlidingWindow {


    static int MaxSubArraySum(int[] a, int k){
        int wSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < k;i++){
            wSum += a[i];
        }
        maxSum = wSum;
        for(int i = k;i < a.length;i++){
            wSum = wSum - a[i-k] + a[i];
            maxSum = Math.max(maxSum, wSum);
        }
        return maxSum;

    }

    public static void Maxarray(int[] a,int k) {

        int max_sum = Integer.MIN_VALUE,wsum = 0;
        

        for(int i = 0;i<k;i++){
            wsum += a[i];
        }
        max_sum = wsum;
        int start = 0;
        for(int i = k; i<a.length;i++){
            wsum =wsum - a[i-k] + a[i];
            if(wsum>max_sum){
                max_sum = wsum;
                start = i-k+1;
            }
        }

        for(int i = start;i<start+k;i++){
            System.out.println(a[i]);
        }  


        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        System.out.println(MaxSubArraySum(a, k));

        Maxarray(a, k);
        
    }
    
}

/*sample input:-

8
2 1 5 1 3 2 6 1
3
output:-
sum :-11
3 2 6 
*/
