package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {
    public static void main(String [] args){
        LinkedHashSet lhs=new  LinkedHashSet ();
        lhs.add(1);
        lhs.add(2);
        lhs.add("A");
        lhs.add(4);
        Iterator e= lhs.iterator();
        while(e.hasNext()){
            System.out.println(e.next());

        }
    }

}
