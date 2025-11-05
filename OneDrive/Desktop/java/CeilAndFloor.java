import java.util.*;

public class CeilAndFloor {

    public static int ceil(int[] a,int key){
        int low = 0,high = a.length-1,mid = 0;

        while(low<=high){
            mid = (low+high) >>1;
            if(key == a[mid]){
                return a[mid];
            }else if(key <a[mid]){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        if(low<a.length){
            return a[low];
        }else{
            return -1;
        }
        
    }

    public static int floor(int[] a,int key){
        int low = 0,high = a.length-1,mid = 0;

        while(low<=high){
            mid = (low+high) >>1;
            if(key == a[mid]){
                return a[mid];
            }else if(key <a[mid]){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }if(high >=0){
            return a[high];
        }else{
            return -1;
        }
        
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70};
        System.out.println(ceil(a,80));
        System.out.println(floor(a, 5));
    }
    
}
