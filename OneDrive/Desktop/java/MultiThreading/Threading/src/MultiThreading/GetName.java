public class GetName extends Thread {

    public void run() {

        Thread.currentThread().setName("MyChildThread");
        System.out.println("Thread is running by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Main thread started by " + Thread.currentThread().getName());
        Thread thread = Thread.currentThread();
        System.out.println("Current thread name: " + thread.getName());
        thread.setName("MyMainThread");
        System.out.println("Updated thread name: " + thread.getName()); 
        //System.out.println(10/0);

        GetName thread1 = new GetName();
        thread1.start();
        System.out.println("Child thread name: " + thread1.getName());

        GetName thread2 = new GetName();
        thread2.start();

        GetName thread3 = new GetName();
        thread3.start();

        System.out.println("Main is alive: " + thread.isAlive());

        

      System.out.println("child is alive: " + thread1.isAlive());


    }
    
}
