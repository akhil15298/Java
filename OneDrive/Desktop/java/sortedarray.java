import java.util.*;
public class sortedarray {
    public static int strictlyinc(int arr[],int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        if(arr[n-1] <=arr[n-2]){
            return 0;
        }
        return strictlyinc(arr, n-1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(strictlyinc(arr,n) == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
    }
}
