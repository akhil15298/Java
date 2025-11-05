import java.util.*;

public class revstringrecursive {
        public static String revstr(String s,String rev,int n){
            if(n < 0){
                return rev;
            }
            return revstr(s,rev+s.charAt(n),n-1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(revstr(s,"",s.length()-1));

        }
}
