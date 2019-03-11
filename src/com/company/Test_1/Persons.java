package com.company.Test_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persons {

    private String name;
    private String surName;
    private  int age;
    private String location;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    // Constructors
    public Persons() {}

    public Persons(String name, String surName, int age, String location) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.location = location;
    }

    // Getters
    public String getName() {
        if(name != null && !name.equals("\n")  && !name.equals("\t") && !name.equals(" ") && name.length() > 2) {
            return name;
        } else {
            System.out.println("\t\tError! You enter incorrect name!");
            System.out.print("\t\tPlease enter correct name: ");
            setName(name);
            getName();
        }
        return name;
    }

    public String surName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
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
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void showName() {
        System.out.printf("person name: \t%s\n", getName());
    }
}
