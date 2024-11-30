package com.asquare.example.abstractfactory;

public class IvyLeagueUniversityFactory extends UniversityFactory{

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "Math":
                return new MITAdmitCard();
            case "Physics":
                return new CalTechAdmitCard();
            default:
                break;

        }
        return null;
    }
}
