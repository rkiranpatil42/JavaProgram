package Collection;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Iterator;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> arl = new ArrayList<Student>();
        arl.add(new Student("Kiran", 38));
        arl.add(new Student("Gopal", 23));
        arl.add(new Student("Shubham", 24));
        Iterator e= arl.iterator();
     while(e.hasNext()){
         Student s=(Student) e.next();
         System.out.println("Name="+s.Name+"rollno="+s.rollno);

     }


    }
}
