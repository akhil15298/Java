import java.util.*;
public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int oper = sc.nextInt();
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){     //get bit
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
        int newnum = bitMask | n;       //setbit
        System.out.println(newnum);

        int notBitmask = ~(bitMask);        //clear bit
        int newnum2 = notBitmask & n;
        System.out.println(newnum2);

        //update bit = setbit for 1,clear bit for 0
        if(oper == 1){
            int newnum3 = bitMask | n;       //setbit
            System.out.println(newnum3);
        }
        else{
            int notBitmask1 = ~(bitMask);        //clear bit
            int newnum4 = notBitmask & n;
            System.out.println(newnum4);
        }
    }

}
