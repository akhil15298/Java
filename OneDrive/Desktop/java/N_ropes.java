import java.util.*;
 
public class N_ropes {
    public static Integer largest(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        
        for(int i = 0; i<n;i++){
            pq.add(arr[i]);
        }
        int ans = 0;
        while (pq.size()>1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first+second;
            ans = ans +sum;
            pq.add(sum);
            
        }

        
        return ans;
    
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        //int k = sc.nextInt();
        System.out.println(largest(arr));
        
    }
}
