public class DaemonThread extends Thread {

    public void run() {
         try {
        Thread.sleep(1000); // small delay to show interleaving
        } catch (InterruptedException e) {}
    
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running: " + Thread.currentThread().getName());
        } else {
            System.out.println("User thread is running: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // Setting the thread as daemon
        daemonThread.start();

        System.out.println("Main thread is runningg: " + Thread.currentThread().getName());

        DaemonThread userThread = new DaemonThread();
        userThread.start();

        Thread t = Thread.currentThread();
       // t.setDaemon(true); 
        // This will throw IllegalThreadStateException
        t.start();  
        System.out.println("Main thread is running: " + t.getName());
    }
    
}
