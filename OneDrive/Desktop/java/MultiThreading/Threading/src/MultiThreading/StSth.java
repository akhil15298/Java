public class StSth extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        StSth thread = new StSth();
        //thread.isAlive();
        thread.start();
        
        //thread.isAlive();
       /* thread.start(); if we use the same object thread again
        it will throw IllegalThreadStateException due to thread already started 
       and after completion it cannot be restarted due to it is in dead state..*/ 
    }

}

