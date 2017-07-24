package gst;

public class Cloth extends Item{
    static final int GST_RATE=12;
    Cloth(String name, double price,int qty){

        this.name=name;
        this.price=price;
        this.qty=qty;
    }
    public double getGst(){
        return price*GST_RATE/100*qty;

    }
}
