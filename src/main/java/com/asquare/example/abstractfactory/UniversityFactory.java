package com.asquare.example.abstractfactory;

public abstract class UniversityFactory {
    private static int  cutOff =109;

    public static UniversityFactory getUniversityFactory(int score){
        if(score > cutOff){
            return new IvyLeagueUniversityFactory();
        } else {
            return new PublicUniversityFactory();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);
}
