package House;

public class House {
    private String owner;
    private double price;
    private String description;

    public House(String owner, double price, String description) {
        this.owner = owner;
        this.price = price;
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


