package com.example.labo10;

public class Person {
    private String firstName;
    private  String familyName;

    public Person() {
        this.firstName = "";
        this.familyName = "";
    }
    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public  String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {return familyName;}

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
