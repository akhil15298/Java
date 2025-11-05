public class TryCatchFlow {

    public static void main(String[] args) {
        System.out.println("========With exception==============");
         try{
            System.out.println("2");
            int a = 10,b = 0,c;
            System.out.println("3");
            c = a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
        }catch(Exception e){
            System.out.println("6");
            System.out.println(e);
            System.out.println("Above line is the exception & description");
            e.printStackTrace();
            System.out.println("Above line is the exception & description & stacktrace");

        }
        System.out.println("7");
        System.out.println("hello");

        System.out.println("=====Without Exception===========");
         try{
            System.out.println("12");
            int a = 10,b = 2,c;
            System.out.println("13");
            c = a/b;
            System.out.println("14");
            System.out.println(c);
            System.out.println("15");
        }catch(Exception e){
            System.out.println("16");
            System.out.println(e);
            System.out.println("Above line is the exception & description");
            
            e.printStackTrace();
            System.out.println("Above line is the exception & description & stacktrace");
        }
        System.out.println("17");
        System.out.println("hello");


    }
    
}
