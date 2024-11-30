package com.asquare.example;

import com.asquare.example.builderpattern.URLBuilder;

public class TestBuilderPattern {

    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("http://").hostname("mywebsite").port("443");
        URLBuilder urlBuilder = builder.build();
        System.out.println("Built URL website:: "+ urlBuilder.hostname);
    }
}
