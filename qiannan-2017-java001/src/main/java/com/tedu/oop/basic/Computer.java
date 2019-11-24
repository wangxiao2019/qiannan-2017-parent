package com.tedu.oop.basic;
//封装一个电脑类
public class Computer {
    private String name;
    private String paizi;
    private int price;
    private String country;

    public Computer() {

    }
    public Computer (String name,String paizi,int price,String country){
            this.name=name;
        this.paizi=paizi;
        this.price=price;
        this.country=country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaizi() {
        return paizi;
    }

    public void setPaizi(String paizi) {
        this.paizi = paizi;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

