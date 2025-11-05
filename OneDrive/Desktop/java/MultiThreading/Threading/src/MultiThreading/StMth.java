public class StMth extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        StMth thread1 = new StMth();
        thread1.start();
        StMth thread2 = new StMth();
        thread2.start();    
    }
    
}
