package com.company;

import java.util.Date;

public class Employee extends Person {

    // Constructors
    Employee() {
        super();
    }

    Employee(String name, String surName, int age, String location) {
        super(name, surName, age, location);
    }

    Employee(String name, String surName, int age, String location, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        super(name, surName, age, location, yearOfBirth, monthOfBirth, dayOfBirth);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurName() {
        return super.getSurName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public Gender getGender() {
        return super.getGender();
    }

    @Override
    public Date getBirthDay() {
        return super.getBirthDay();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurName(String surName) {
        super.setSurName(surName);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public void setGender(Gender gender) {
        super.setGender(gender);
    }

    @Override
    public void setBirthDay(Date birthDay) {
        super.setBirthDay(birthDay);
    }

    @Override
    public void showFullInfo() {
        String infoAboutPerson = String.format("Employee name:\t%1$s\t\tyour age - %2$d and birthDay is %3$tY-%3$tB-%3$td\n\t\tyour gender - %4$s\n\t\tyou from - %5$s\n", fullName(), getAge(), getBirthDay(), getGender(), getLocation());
        System.out.println(infoAboutPerson);
    }

    @Override
    public void showShortInfo() {
        String showInfoPerson = String.format("Employee name:\t%1$s\t\tyour age - %2$d\n\t\tyou from - %3$s", fullName(), getAge(), getLocation());
        System.out.println(showInfoPerson);
    }

    @Override
    public String fullName() {
        return super.fullName();
    }


}
