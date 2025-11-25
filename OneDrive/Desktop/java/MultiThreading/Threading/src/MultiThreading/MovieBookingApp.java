
class Booking{
    int availableSeats = 10;
     synchronized void bookSeat(int seats){  // if sync is not used then will get issue
        if(availableSeats >= seats){
            System.out.println(seats + " seats booked successfully.");
            availableSeats -= seats;
            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed. Not enough seats available.");
        }
    }   
}

public class MovieBookingApp extends Thread {
    
    static Booking booking = new Booking();
    int seatsToBook;

    

    public void run(){
       
            booking.bookSeat(seatsToBook);
        
    }

    public static void main(String[] args) {
        MovieBookingApp user1 = new MovieBookingApp();
        MovieBookingApp user2 = new MovieBookingApp();
        user1.seatsToBook = 7;
        user2.seatsToBook = 6;

        user1.start();
        user2.start();
    }
}
