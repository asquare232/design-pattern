package com.asquare.example.abstractfactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        int entranceExamScore = 125;
        UniversityFactory abstractUniversityFactory = UniversityFactory
                .getUniversityFactory(entranceExamScore);

        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        System.out.println("Admit card ::"+ admitCard.getClass());

    }
}
