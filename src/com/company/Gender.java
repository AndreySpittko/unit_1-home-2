package com.company;

public enum Gender {

    MALE("Чоловік"),
    FEMALE("Жінка");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String toString(){
        return this.gender;
    }
}
