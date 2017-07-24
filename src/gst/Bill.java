package gst;


public class Bill {
    public static void main(String[] args) {
        Cloth c = new Cloth("Shirt Denium", 500, 2);
        Toy t = new Toy("Tedddy", 500, 2);
        Item items[]=new Item[2];
        items[0]=t;
        items[1]=c;


        double clothGst = c.getGst();
        double toyGst = t.getGst();
        System.out.println(clothGst);
        System.out.println(toyGst);
        Invoice i=new Invoice();
        i.printInvoice(items);
    }
}
