package com.asquare.example;

import com.asquare.example.factoryclass.Course;
import com.asquare.example.factoryclass.CourseFactory;

public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Course hldCourse= CourseFactory.getCourse("HLD");
        Course lldCourse= CourseFactory.getCourse("LLD");

        assert hldCourse != null;
        System.out.println("HLD Course :"+ hldCourse.getModules());

        assert lldCourse != null;
        System.out.println("LLD Course :"+ lldCourse.getModules());
    }
}