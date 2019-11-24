package book_manager.Operation;

public class Book {
    private String id;
    private String name;
    private String author;
    private String type;
    private int price;
    private boolean isBorrow;


    public Book() {
    }

    public Book(String name, String id, String author, int price, String type, boolean flag){
        this.name =name;
        this.id = id;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrow = flag;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isBorrow=" + isBorrow +
                '}';
    }
}
