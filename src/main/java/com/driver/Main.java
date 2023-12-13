package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
//        rw.name="xyz";
//        System.out.println(rw.name);
//        java: name has private access in com.driver.RWOnly
        rw.setToken("Abc");
        rw.getToken();
    }
  
}