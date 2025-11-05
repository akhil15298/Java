import java.util.*;

public class subsetsum {

    static int countsub(int[] arr,int sum,int i){
        if(sum == 0){
            return 1;
        }
        if(sum <0){
            return 0;
        }
        if(i == arr.length){
            return 0;
        }

        return countsub(arr, sum-arr[i], i+1) + countsub(arr, sum, i+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        System.out.println(countsub(arr, sum, 0));
    }
    
}
