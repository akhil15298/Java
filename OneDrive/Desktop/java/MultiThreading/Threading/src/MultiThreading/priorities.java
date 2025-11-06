public class priorities extends Thread {

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        priorities t1 = new priorities();
        priorities t2 = new priorities();
        priorities t3 = new priorities();

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());
        System.out.println("Thread 3 Priority: " + t3.getPriority());
    }
    
}
