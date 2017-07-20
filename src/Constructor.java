/**
 * Created by kiran on 7/18/17.
 */
public class Constructor {
    private Constructor() {

    }

    public static Constructor createConstructor() {
        return new Constructor();
    }

    public void print() {
        System.out.println("Done");
    }

}