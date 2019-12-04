package com.tedu.cn;

import org.junit.Test;

public class StringMatchDemo {
    @Test
    public void m1(){
        String regex="[a-z]";
        System.out.println("a".matches(regex));
        regex="[^(a-zA-Z0-9)]";
        System.out.println("-".matches(regex));
    }
}
