import java.util.Scanner;


class YoungerException extends RuntimeException{
        YoungerException(String msg){
            super(msg);
        }

}

public class Throw {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try{
            if(age<18){
             throw new YoungerException(" You are not eligible for voting");
        }else{
            System.out.println("You are eligible for voting");    
        }
        }catch(YoungerException e){
            e.printStackTrace();
            //System.out.println(e);
        }
        System.out.println("Hello");
        // if(age<18){
        //      throw new YoungerException(" You are not eligible for voting");
        // }else{
        //     System.out.println("You are eligible for voting");    
        // }
    }
}
