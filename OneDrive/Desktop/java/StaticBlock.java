public class StaticBlock {

    static{
        System.out.println("hello");
        //System.exit(0);
    }
    public static void main(String[] args) {
        System.out.println("Im main");
    }
    static{
        System.out.println("hi");
    }
}
