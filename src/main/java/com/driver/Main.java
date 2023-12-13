package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
//        java: name has private access in com.driver.RWOnly
        rw.setToken("Abc");
        rw.getToken();
    }
  
}