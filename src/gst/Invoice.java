package gst;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Invoice {
    public void printInvoice(Item items[]) {
        double totalGst = 0.0d;
        double totalprice = 0.0d;
        for (int i = 0; i < items.length; i++) {
            double Gst = items[i].getGst();
            totalGst = totalGst + Gst;
            totalprice = items[i].price;
            printInvoiceItemBlock(items[i]);
        }
        System.out.println(totalGst + totalprice);
    }
    private void printInvoiceItemBlock(Item items){
        System.out.println("\nitem name:" +items.name+ "\nitem price:"+items.price+ "\nitems.qty:"+items.qty);
    }
    }