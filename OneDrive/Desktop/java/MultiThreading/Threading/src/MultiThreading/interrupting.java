public class interrupting extends Thread {
    @Override
    public void run() {
       
            try {
                for(int i = 1; i <= 5; i++) {
                System.out.println("Iteration: " + i + " from thread " + Thread.currentThread().getName());
                Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        //} // Simulating some work with sleep
    }
    public static void main(String[] args) {
        interrupting t1 = new interrupting();
        interrupting t2 = new interrupting();

        t1.start();
        t2.start(); 
        t1.interrupt();
        //t2.interrupt();
    }
    
}
