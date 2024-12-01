package com.asquare.example.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        LoggerSingleton singleton =  LoggerSingleton.getInstance();
        System.out.println(singleton);

        LoggerSingleton singleton1 =  LoggerSingleton.getInstance();
        System.out.println(singleton1);
    }
}
