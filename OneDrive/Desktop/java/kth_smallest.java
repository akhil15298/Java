import java.util.*;
 
public class kth_smallest {
    public static Integer largest(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        
        for(int i = 0; i<k;i++){
            pq.add(arr[i]);
        }
        for(int i = k;i<n;i++){
            if(pq.peek() > arr[i]){
                pq.poll();
                pq.add(arr[i]);

            }

        }
        return pq.peek();
    
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(largest(arr, k));
        
    }
}
