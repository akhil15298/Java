import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        
        Vector v = new Vector();
        v.add(10);  
        v.add(20);
        v.add(30);
        v.add(0,"Akhil");
        v.addElement(40);
        v.add(60);
        v.setElementAt(9834, 1);  //setElementAt(index, value)
        

        System.out.println(v);

        System.out.println(v.capacity()); //== if(no of element <10){capacity = 10-;else{capacity = element *2}

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.remove(2);
        v.removeElementAt(0);

        System.out.println(v);

        v.removeAllElements();
        System.out.println(v);

    }
}
