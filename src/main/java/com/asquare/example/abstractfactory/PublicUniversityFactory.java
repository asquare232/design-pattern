package com.asquare.example.abstractfactory;

public class PublicUniversityFactory extends UniversityFactory{


    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "Math":
                return new OxfordAdmitCard();
            case "Physics":
                return new CalTechAdmitCard();
            default:
                break;

        }
        return null;
    }
}
