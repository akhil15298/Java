import java.util.*;

public class insertionsort {

    public static void printarray(int arr[],int n) {
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");              
        }                                               
        System.out.println();                           
                                                         
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int min = 0,temp = 0;
        for(int i = 0;i<n;i++){
            min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
                
            }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
        }
        printarray(arr, n);
    }
}
