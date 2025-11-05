


class MyThread1 extends Thread {
        public void run() {
            System.out.println("Thread1 is running");
        }
    }
    class MyThread2 extends Thread {
        public void run() {
            System.out.println("Thread2 is running");
        }
    }
    
public class MtMth {

        public static void main(String[] args) {
            // MtMth outer = new MtMth();
            // MtMth
            //  MyThread1 t1 = outer.new MyThread1();
        
            //     t1.start();
        

            // MyThread2 t2 = outer.new MyThread2();
            // t2.start();

            MyThread1 t1 = new MyThread1(); 
            t1.start(); 
            MyThread2 t2 = new MyThread2(); 
            t2.start();
        }
}
