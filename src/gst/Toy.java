package gst;

public class Toy extends Item {
    static final int GST_RATE=18;
    Toy(String name, double price,int qty){

        this.name=name;
        this.price=price;
        this.qty=qty;
    }

    @Override
    public double getGst() {
        return (price*18/100)*qty;
    }


}