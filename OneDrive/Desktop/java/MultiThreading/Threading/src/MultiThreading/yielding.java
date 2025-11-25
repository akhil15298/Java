public class yielding extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i + " from thread " + Thread.currentThread().getName());
            if(i == 3) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " is yielding...");
                //Thread.yield(); // Yielding the CPU
            }
        }   
    }

    public static void main(String[] args) {
        yielding y1 = new yielding();
        yielding y2 = new yielding();
        
        y1.start(); 
        y2.start(); 

        for(int i = 1; i <= 5; i++) {
            Thread.yield(); // Main thread yielding 
            System.out.println("Iteration: " + i + " from main thread");
        }
    }   
    
}
