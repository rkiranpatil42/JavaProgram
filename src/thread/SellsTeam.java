package thread;

/**
 * Created by kiran on 8/26/17.
 */
public class SellsTeam extends Thread
{
    GoDown goDown;
    SellsTeam(GoDown g){
        this.goDown=g;
    }
    public void run() {
        for (int i=0;i<200;i++){
            goDown.getItem();
        }
    }
}
