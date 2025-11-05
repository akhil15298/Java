public class Bitonic {

    public static int asc(int[] a,int key,int range){

        int low = 0,high = range,mid = 0;

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
        return -1;
    }
    public static int desc(int[] a,int key,int range){

        int low = range,high = a.length,mid = 0;

        while(low<=high){
            mid = (low+high) >>1;
            if(key == a[mid]){
                return a[mid];
            }else if(key <a[mid]){
                
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
    

    public static int bitonicpoint(int[] a){

        int low = 0,high = a.length,mid = 0;

        while(low<=high){
            mid = (low+high) >>1;
            if(a[mid] > a[mid -1] && a[mid] >a[mid+1]){
                return mid;
            }else if(a[mid] > a[mid -1] && a[mid] < a[mid+1]){
                low = mid;
            }else{
                high = mid;
            }
        }
        return -1;
    }

    public static int searchBitonic(int[] a,int key,int Bindex){
        if(key == a[Bindex]){
            return Bindex;
        }
        if(key > a[Bindex]){
            return -1;
        }
        int res1 = asc(a, key, Bindex-1);
        if(res1!= -1){
            return res1;
        }
        int res2 = asc(a, key, Bindex+1);
        if(res2!= -1){
            return res2;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,8,6,4,2};
        int key = 9;
        int Bindex = bitonicpoint(a);
        System.out.println(searchBitonic(a, key, Bindex));
    }
    
}
