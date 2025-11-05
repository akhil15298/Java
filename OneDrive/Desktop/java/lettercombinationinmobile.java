import java.util.*;

public class lettercombinationinmobile {
    private static final Map<Character,String> keypad = new HashMap<>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");

    }};
    
    static ArrayList<String> al = new ArrayList<>();

    static void printlist(String s,String ans){

        if(s.length() == 0){
            al.add(ans); 
            return;
        }
        
        String key = keypad.get(s.charAt(0));
        for(int i = 0;i<key.length();i++){
            printlist(s.substring(1), ans+key.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        printlist(s, "");
        System.out.println(al);
    }

}
