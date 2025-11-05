//public class Test {
package MultiThreading;

//import java.lang.*;

public class Test extends Thread{

    public void run(){
        System.out.println("thread by class");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }    
}

//}
