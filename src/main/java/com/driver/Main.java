package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
//        java: name has private access in com.driver.RWOnly
        rw.setName("abc");
        System.out.println(rw.getName());
    }
  
}