package com.tedu.cn;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class StringApiDemo {


@Test
public void testGetBytes() throws UnsupportedOperationException, UnsupportedEncodingException {
    byte[] bs= "UTF-8".getBytes("UTF-8");
    for (int i = 0;i<bs.length;i++){
        System.out.println(bs[i]);
    }
}
@Test
public void testSubString(){
    String str = "I love you";
    System.out.println(str.substring(2,6));
    String src ="sdmcndjvfjnbjdgfbdgfbgjibdjfiuvfidjgifijdgifjigfwww.baidu.comehcuyhhbd";
    String d =  "www.baidu.com";
    System.out.println(src.substring(src.indexOf(d),src.indexOf(d)+d.length()));
}
@Test
 public void m1(){
    StringBuilder builder = new StringBuilder();
    builder.append("I love you ");
    builder.append( 2019);
    builder.append(" will be end");
    System.out.println(builder.toString());
 }
}