import java.util.*;
public class reversestring {
    public static void rev(String s) {
        if(s == null || s.length()<=1){
            System.out.println(s);
        }else{
            System.out.print(s.charAt(s.length()-1));
            rev(s.substring(0, s.length()-1));
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        rev(s);
        
    }
    
}
