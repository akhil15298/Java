class MovieTicketBooking{
   static int availableSeats = 30;
     synchronized static void bookSeat(int seats){  // if sync is not used then will get issue
        if(availableSeats >= seats){
            System.out.println(seats + " seats booked successfully.");
            availableSeats -= seats;
            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed. Not enough seats available.");
        }
    }  
}


class MyThread1 extends Thread{
    MovieTicketBooking b;
    int seats;
    MyThread1(MovieTicketBooking b2, int seats){
        this.b = b2;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    MovieTicketBooking b;
    int seats;
    MyThread2(MovieTicketBooking b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}


public class BookTheaterSeats {
    public static void main(String[] args) {
        MovieTicketBooking b = new MovieTicketBooking();
        MyThread1 t1 = new MyThread1(b, 15);
        MyThread2 t2 = new MyThread2(b, 10);
        t1.start();
        t2.start();

        MovieTicketBooking b1 = new MovieTicketBooking();
        MyThread1 t3 = new MyThread1(b1, 4);           
        MyThread2 t4 = new MyThread2(b1, 10);
        t3.start();     
        t4.start();
    }
}
