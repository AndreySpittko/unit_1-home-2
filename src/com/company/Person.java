package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.GregorianCalendar;


public /*abstract*/ class Person {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private String name;
    private String surName;
    private  int age;
    private String location;
    private Gender gender;
    private Date birthDay;

    // Constructors
    public Person() {}

    public Person(String name, String surName, int age, String location) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.location = location;
    }

    public Person(String name, String surName, int age, String location, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this(name, surName, age, location);
        GregorianCalendar calendar = new GregorianCalendar(yearOfBirth, monthOfBirth, dayOfBirth);
        this.birthDay = calendar.getTime();
    }

    // Getters
    public String getName() {
        if(name != null && !name.equals("\n") && !name.equals("\t") && !name.equals(" ") && name.trim().length() > 2) {
            if(name.length() > 30) {
                return name.substring(0, 30);
            }
        } else {
            System.out.println("\t\tError! You enter incorrect name!");
            System.out.print("\t\tPlease enter correct name: ");
            setName(name);
            getName();
        }
        return name;
    }

    public String getSurName() {
        if(surName != null && !surName.equals("\n") && !surName.equals("\t") && !surName.equals(" ") && surName.trim().length() > 2){
            if(surName.length() > 30){
                return surName.substring(0, 30);
            }
        } else {
            System.out.println("\t\tError! You enter incorrect surName!");
            System.out.print("\t\tPlease enter correct surName: ");
            setSurName(surName);
            getSurName();
        }
        return surName;
    }

    public int getAge() {
        if(age > 0 && age < 7) {
            System.out.println("Your're babe");
        } else if(age > 6 && age < 18) {
            System.out.println("Your're schoolchild ");
        } else if(age > 18 && age < 25) {
            System.out.println("Your're student ");
        } else if(age > 25&& age < 60) {
            System.out.println("Your're working person ");
        } else if(age > 60 && age < 90) {
            System.out.println("Your're pensioner ");
        } else{
            System.out.println("\t\tError! You enter incorrect age!");
            System.out.print("\t\tPlease enter correct age: ");
            setAge(age);
            getAge();
        }
        return age;
    }

    public String getLocation() {
        if(location != null && !location.equals("\t") && !location.equals(" ") && !location.equals("\n") && location.trim().length() > 2) {
/*            if(location.length() > 50) {
                return location.substring(0, 50);
            }*/
        } else {
            System.out.println("\t\tError! You enter incorrect location!");
            System.out.print("\t\tPlease enter correct location: ");
            setLocation(location);
            getLocation();
        }
        return location;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }


    // Setters
    public void setName(String name) {
        try{
            name = br.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    public void setSurName(String surName) {
        try{
            surName = br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        this.surName = surName;
    }

    public void setAge(int age) {
        try{
            age = Integer.parseInt(br.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }
        this.age = age;
    }

    public void setLocation(String location) {
        try{
            location = br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        this.location = location;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void showFullInfo() {
        String infoAboutPerson = String.format("Person name:\t%1$s\t\tyour age - %2$d and birthDay is %3$tY-%3$tB-%3$td\n\t\tyour gender - %4$s\n\t\tyou from - %5$s\n", fullName(), getAge(), getBirthDay(), getGender(), getLocation());
        System.out.println(infoAboutPerson);
//        String infoAboutPerson = String.format("Person name:\t%s\n\t", fullName());
//        String infoAboutPerson1 = String.format("Person name:\t%1$s %2$s\n\t\t your age - %3$d and birthDay is %4$tY-%4$tB-%4$td\n\t\tyour gender - %5$s\n\t\tyour from - %6$s\n\n", getName(), getSurName(), getAge(), getBirthDay(), getGender(), getLocation());
//        return infoAboutPerson;
    }

    public void showShortInfo(){
        String showInfoPerson = String.format("Person name:\t%1$s\t\tyour age - %2$d\n\t\tyou from - %3$s", fullName(), getAge(), getLocation());
        System.out.println(showInfoPerson);
    }


    public String fullName() {
        String fullName = String.format("%s %s\n", getName(), getSurName());
//        System.out.printf("%s %s\n", getName(), getSurName());
        return fullName;
    }
}
