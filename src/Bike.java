class Bike implements Vehical2 {
    String name;
    int avg;

    Bike(String name, int avg) {
        this.name = name;
        this.avg = avg;
    }

    public void working() {
        System.out.println("Its Bike...");

    }
}