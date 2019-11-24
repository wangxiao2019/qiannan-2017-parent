package book_manager.Operation;



import java.util.List;
import java.util.Scanner;

public class Borrow implements IO{

    public void work(List<Book> bookList) {
        int i=0;
        int flag=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入需要借阅的书名");
        String name = scan.next();
        for(;i<bookList.size();i++){
            if(name.equals(bookList.get(i).getName())){
                if(bookList.get(i).isBorrow()==false){
                    System.out.println("借阅成功");
                    flag=1;
                    bookList.get(i).setBorrow(true);
                }

            }
        }
        if(flag==0){
            System.out.println("不好意思，借阅失败");
        }

    }
}

