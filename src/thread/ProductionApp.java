package thread;

/**
 * Created by kiran on 8/26/17.
 */
public class ProductionApp {
    public static void main(String[] args){
        GoDown g=new GoDown();
        Producer p =new Producer(g);
        Producer p1=new Producer(g);
        SellsTeam st =new SellsTeam(g);
        SellsTeam st1 =new SellsTeam(g);
        p.start();
        p1.start();
        st.start();
        st1.start();

    }
}
