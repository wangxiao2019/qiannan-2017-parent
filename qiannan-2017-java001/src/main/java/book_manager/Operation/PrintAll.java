package book_manager.Operation;

import book_manager.book.BookList;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class PrintAll implements IO{

    public void work(List<Book> bookList) {

    }
    public void work(BookList bookList){
        for (int i=0;i<bookList.getSize();i++){
            System.out.println(bookList.getBook(i));
        }
    }
}
