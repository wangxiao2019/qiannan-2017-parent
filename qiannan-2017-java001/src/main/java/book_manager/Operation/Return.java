package book_manager.Operation;

import book_manager.book.BookList;

import java.util.List;
import java.util.Scanner;

public class Return implements IO {
    @Override
    public void work(List<Book> bookList) {

    }
    public void work(BookList bookList){
        int i=0;
        int flag=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入需要归还的ID");
        String id=scan.next();
        for(;i<bookList.getSize();i++){
            if (id.equals(bookList.getBook(i).getId())){
                if(bookList.getBook(i).isBrrow()==true){
                    System.out.println("归还成功");
                    bookList.getBook(i).setBrrow(false);
                    flag=1;
                }
                else{
                    System.out.println("归还失败");
                }
            }
        }
        if (flag==0){
            System.out.println("不好意思，没有此书");
        }
    }
}
