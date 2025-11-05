import java.util.*;;

public class strings {
    public static void comp(String s1,String s2) {
        if(s1.compareTo(s2) == 0){
            System.out.println("they are equal");
        }else{ 
            System.out.println("they are not equal");
        }
       
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        comp(s1, s2);
    }
}
