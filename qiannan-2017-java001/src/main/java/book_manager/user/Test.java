package book_manager.user;

/*
import book_manager.book.BookList;
import book_manager.user.Admin;
import book_manager.user.NormalUser;
import book_manager.user.User;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        BookList list = new BookList();
        User user = login();
        //通过不同的choice和身份调用不同的Operation方法
        while(true){
            int choice = user.menu();
            user.doOperation(choice, list);
        }
    }

    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.next();
        System.out.println("请输入你的身份");
        System.out.println("1.普通用户 2.管理员");
        int role= scanner.nextInt();
        if(role==1){
            return new NormalUser(name);
        }
        else{
            return new Admin(name);
        }

    }
}


*/
