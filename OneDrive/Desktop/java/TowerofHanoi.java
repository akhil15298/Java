import java.util.*;
public class TowerofHanoi {
    public static void tower(int n,char src,char aux,char dest ) {
        if(n == 1){
            System.out.println(src + " --> " + dest);
            return ;
        }
        tower(n-1,src,dest,aux);
        //System.out.println("Move " + n + " from "+src+" to "+dest);
        tower(1, src, aux, dest);
        tower(n-1,aux,src,dest);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char src = sc.next().charAt(0);
        char aux = sc.next().charAt(0);
        char dest = sc.next().charAt(0);
        tower(n, src, aux, dest);

        
    }


    
}
