package Collection;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args){
        ArrayList al=new ArrayList();

      al.add("kiran");
        al.add(21);
        al.add(2,5);
        Object x=al.get(1);
        System.out.println(x);
        System.out.println(al.get(0));
        for(Object y:al){
            System.out.println(y);
        }



    }
}
