public class StudentDemo {
    private String name;
    private int rollno;
    // public int setrollno;

    public String toString() {
        String printString = "Name:" + name + "\nrollno:" + rollno;
        return printString;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int setrollno(int rollno) {
        this.rollno = rollno;

        return rollno;
    }

}
