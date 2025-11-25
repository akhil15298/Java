public class MyThreadinterrupting  extends Thread{

    public void run(){
         Thread.currentThread().interrupt();

        // First check using interrupted() -> true, then resets flag
        System.out.println("First check with interrupted(): " + Thread.interrupted());

        // Second check using interrupted() -> false, because flag was cleared
        System.out.println("Second check with interrupted(): " + Thread.interrupted());

        // Now set interrupt flag again
        Thread.currentThread().interrupt();

        // Check with isInterrupted() -> true, does not reset flag
        System.out.println("First check with isInterrupted(): " + Thread.currentThread().isInterrupted());

        // Check again with isInterrupted() -> still true
        System.out.println("Second check with isInterrupted(): " + Thread.currentThread().isInterrupted());
    }
    public static void main(String[] args) {
        MyThreadinterrupting t1 = new MyThreadinterrupting();
        MyThreadinterrupting t2 = new MyThreadinterrupting();

        t1.start();
        t2.start(); 
        //t1.interrupt();
        //t2.interrupt(); 
    }
    
}
