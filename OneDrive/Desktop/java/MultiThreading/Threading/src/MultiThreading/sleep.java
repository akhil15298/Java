public class sleep extends Thread {

    public void run() {
        // This method is intentionally left blank
        for(int i = 6; i <= 10; i++) {
            try {
                //Thread.sleep(0,100000); // 
                Thread.sleep(1000); // Sleep for 1 second   
                System.out.println("Iteration: " + i  + " from thread " + Thread.currentThread().getName());  
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }   
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            //System.out.println("Iteration: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
                System.out.println("Iteration: " + i + " from thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }   
        sleep s = new sleep();
        s.start(); 
        
        sleep s1 = new sleep();
        s1.run(); 

        sleep s2 = new sleep();
        s2.run();   
    }
    
}
