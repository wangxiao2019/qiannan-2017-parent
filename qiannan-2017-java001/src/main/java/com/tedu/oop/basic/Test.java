package com.tedu.oop.basic;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setName("暗影精灵");
        computer.setPaizi("惠普");
        computer.setCountry("中国");
        computer.setPrice(7300);

        System.out.println(computer.getName());
        System.out.println(computer.getPaizi());
        System.out.println(computer.getCountry());
        System.out.println(computer.getPrice());
        System.out.println("=====================");
        Computer computer1 = new Computer("暗影", "惠普", 7400, "中国");
        System.out.println(computer1.getName());
        System.out.println(computer1.getPaizi());
        System.out.println(computer1.getCountry());
        System.out.println(computer1.getPrice());
    }
}
