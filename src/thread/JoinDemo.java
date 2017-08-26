package thread;

public class JoinDemo implements Runnable
{

    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread" + Thread.currentThread().getName() + "=" + i);
        }
    }
    public static void main(String args[]) {
        JoinDemo jd = new JoinDemo();
        Thread t = new Thread(jd);
        Thread t2 = new Thread(jd);
        Thread t3 = new Thread(jd);
        t.start();
        t2.start();
        t3.start();
    }
}


