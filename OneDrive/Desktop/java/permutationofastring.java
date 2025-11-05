import java.util.*;

public class permutationofastring {

    static void permutation(char[] arr,int fi){
        if(fi == arr.length){
            System.out.println(arr);
            return;
        }

        for(int i = fi;i<arr.length;i++){
            swap(arr,i,fi);         //to do the swapping
            permutation(arr, fi+1);
            swap(arr,i,fi);         //undo the swapping to get into original position
        }
    }

    static void swap(char[] arr,int i,int fi){
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;

        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permutation(s.toCharArray(), 0);
    }
}
