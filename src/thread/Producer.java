package thread;


public class Producer extends Thread
    {
        GoDown goDown;
        Producer(GoDown g) {
        this.goDown=g;
    }
    public void run(){
        for (int i = 0; i < 200; i++)

        {
            goDown.pushItem();
        }
    }
}
