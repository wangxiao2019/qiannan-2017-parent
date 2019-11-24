package book_manager.Operation;

import book_manager.book.BookList;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class Exit implements IO {
    @Override
    public void work(List<Book> bookList) {

    }
    public void work(BookList bookList){
        System.out.println("退出成功");
        System.exit(0);
    }

}
