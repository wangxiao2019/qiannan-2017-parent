package book_manager.book;
/**
public class Book {
    private String name;
    private String id;
    private String author;
    private int price;
    private String type;
    private boolean isBrrow;

    public Book(String name,String id,String author,int price,
                String type,boolean isBrrow){
        this.name=name;
        this.id=id;
        this.author=author;
        this.price=price;
        this.type=type;
        this.isBrrow=isBrrow;
    }
    @Override   //objiect中内置的类，用来格式化打印book中得信息
    public String toString(){
        return "Book{"+
                "name='"+name+'\''+
                ",id='"+id+'\''+
                ",author='"+author+'\''+
                ",price='"+price+
                ",type='"+type+'\''+
                ",isBrrow='"+isBrrow+
                '}';
    }
    public String getName(){
        return name;
    }
    public boolean isBrrow(){
        return isBrrow;
    }
    public void setBrrow(boolean bool){
        this.isBrrow=bool;
    }
    public String getId(){
        return id;
    }
}
**/