package com.asquare.example.factoryclass;

public class CourseFactory {
    public static Course getCourse(String course){
        switch (course){
            case "LLD": return  new LLD();
            case "HLD": return  new HLD();
            default: return null;
        }
    }

}
