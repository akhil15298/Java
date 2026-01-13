class MovieEarning extends Thread{
    int total_earning = 0;
    int ticket_price = 250; // Price of one movie ticket
    int tickets_sold = 10;  // Total tickets sold

    @Override
    public void run()
    {
        synchronized(this)
        {
            for(int i = 0; i<tickets_sold; i++)
            {
               total_earning = total_earning + ticket_price;

                }
            
           // total_earning = ticket_price * tickets_sold;

            // Notify main thread that calculation is done
            this.notify();
        }
    }
}

public class MainApp
{
    public static void main(String[] args) throws InterruptedException
    {
        MovieEarning me = new MovieEarning();
        me.start();

        synchronized(me)
        {
            me.wait(); // Wait until MovieEarning thread notifies
            System.out.println("Total movie earnings: Rs. " + me.total_earning);
        }
    }

}
