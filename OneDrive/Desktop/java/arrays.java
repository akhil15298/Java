import java.util.*;
public class arrays {
    public static int find(int arr[],int n,int x) {
        for(int i = 0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int x = sc.nextInt();
        System.out.println(find(arr,n,x));
        
    }
}
