public class Produkts {
    private long ID;
    private String title;
    private double price;

    public Produkts(long ID, String title, double price) {
        this.ID = ID;
        this.title = title;
        this.price = price;
    }

    public long getID() {
        return ID;
    }

    public void setID() {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }
}
