import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = sc.nextInt();
        //char y = sc.next().charAt(x);
        int y = sc.nextInt();
        int z = sc.nextInt();
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.setCharAt(x,'y');
        System.out.println(sb);
        sb.insert(x, 's');
        System.out.println(sb);
        //deleting the element
        sb.delete(y, z);
        System.out.println(sb);
        sb.append(c);
        System.out.println(sb);
        sb.append(d);
        System.out.println(sb);
        System.out.println(sb.length());
        for(int i = 0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
    }
}
