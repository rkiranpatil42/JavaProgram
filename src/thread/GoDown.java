package thread;

/**
 * Created by kiran on 8/26/17.
 */
public class GoDown {
    public static final int capacity = 10;
    static int currentItemCount;

    public synchronized void pushItem() {
        System.out.println(currentItemCount);
        if (capacity > currentItemCount)

        {
            if (currentItemCount == 0) {
                System.out.println("godown empty");
                notifyAll();
            }
            System.out.println("Item are present");
            currentItemCount++;
        } else

        {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


    public synchronized void getItem() {
        System.out.println(currentItemCount);
        if (currentItemCount == 0) {
            try {
                System.out.println("godown empty");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            if (currentItemCount == capacity) {
                System.out.println("get the item");
                notifyAll();
            }
            System.out.println("items are consuming");
            currentItemCount--;
        }

    }
}



