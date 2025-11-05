import java.util.*;

public class getallsubsequences {

    static ArrayList<String>al = new ArrayList<String>();

    static void gss(String s, String ans){
        if(s.length() == 0){
            //System.out.println(ans);
            al.add(ans);
            return;
        }

        gss(s.substring(1), ans + s.charAt(0));
        gss(s.substring(1),ans);
    }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

       gss(s, "");
       System.out.println(al);
    }
        
    
    
}
