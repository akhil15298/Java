public class Joining extends Thread {

       //static Thread thread;

    public void run() {

    
        
            try {
               // thread.join();
                for(int i = 1; i <= 5; i++) {
                System.out.println("Iteration: " + i + " from thread " + Thread.currentThread().getName());
                Thread.sleep(1000);
                } // Simulating some work with sleep
            } catch (InterruptedException e) {
                System.out.println(e);
            }
          
    }

    /**
     * 
     */
    public static void main(String[] args) throws InterruptedException {
        //thread.join(); 
        //thread.start();
       // Thread thread = Thread.currentThread();
        //thread = t;
        Joining j1 = new Joining();
        j1.start();

        Joining j2 = new Joining();     
        
      
        
       // j1.start(); 
        try {
            j1.join(); // Main thread waits for j1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        j2.start(); 
        try {
            j2.join(); // Main thread waits for j2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        
            

        System.out.println("Both threads have finished execution.");

        try{
            for(int i = 1; i <= 5; i++) {
                System.out.println("Iteration: " + i + " from thread " + Thread.currentThread().getName());
                    Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }   

                



    }
    
}
