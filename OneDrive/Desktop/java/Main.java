import java.util.*;
  import java.io.*;
  
  public class Main {
    
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        int x = sc.nextInt();
        int sum = 1;
        for(int i = 2;i*i<=x;i++){
          if(x%i==0 ){
            if (x/i == i) {
              sum+=i;
            }else{
              sum = sum+ i+x/i;
            }

          }

        }
        if(sum == x && x!=1){
          System.out.println("true");
        }else{
          System.out.println("false");
        }
      
    }
  }
}