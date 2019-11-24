package com.tedu.oop.basic;

public class Book {
    String bookId;
    String bookName;
    String author;
    String publisher;
    String price;
    Book(){
    }
    Book(String bookId,String bookName,String author,String publisher,String price){
        this.author=author;
        this.bookId=bookId;
        this.bookName=bookName;
        this.price=price;
        this.publisher=publisher;
    }
    void show(){
        System.out.println("书籍编号  书名  作者   出版单位    单价");
        System.out.println(bookId);
        System.out.println(bookName);
        System.out.println(author);
        System.out.println(publisher);
        System.out.println(price);
    }
}
