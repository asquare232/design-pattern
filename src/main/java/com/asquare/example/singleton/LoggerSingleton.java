package com.asquare.example.singleton;

public class LoggerSingleton {
    private static volatile LoggerSingleton instance = null;

    private LoggerSingleton(){}

    public static LoggerSingleton getInstance(){
        if(instance == null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
