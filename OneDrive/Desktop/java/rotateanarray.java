import java.util.*;

public class rotateanarray {

    public static void rotateONE(int[] arr) {

        int temp = arr[0];
        for(int i = 1; i < arr.length;i++){

            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;     
    }

    public static void rotate(int[] arr,int k) {
        k = k%arr.length;
        if(k<0){
            k = k+arr.length;
        }
        for(int i = 1;i<k;i++){
            rotateONE(arr);
        }
        
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRevK(int[] arr,int k) {
        k = k%arr.length;
        if(k<0){
            k = k+arr.length;
        }
       reverse(arr, 0, k-1);
       reverse(arr, k, arr.length-1);
       reverse(arr, 0, arr.length-1);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        rotateRevK(arr,k);
        
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
