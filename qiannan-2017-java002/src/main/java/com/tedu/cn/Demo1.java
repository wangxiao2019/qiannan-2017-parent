package com.tedu.cn;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入整数（例如10）：");

        int n = scanner.nextInt();

        double result = 1;

        System.out.print("1+");

        for (int i = 2; i < n; i++) {

            result += 1.0 / i;

            System.out.print("1/" + i + "+");

        }

        result += 1.0 / n;

        System.out.print("1/" + n + "=" + result);

    }
}
