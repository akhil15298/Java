import java.util.*;

public class isprimeoptmised {   

    public static void prime(int n){
        boolean[] num = new boolean[n+1];
        for(int i = 2;i*i <=n;i++){
            if(num[i] == false){
                for(int j = i*i;j<=n;j = j+i){
                    num[j] = true;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if(num[i] == false){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            prime(n);
        }
    
    
}
