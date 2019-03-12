package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

//    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

//        try {
//            String name = br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

/*
        Person person1 = new Person("Ihor", "Petrow", 25, "Lviv");
        Person person2 = new Person();
        person1.showInfo();

        person2.showInfo();
*/
        Person p1 = new Person();
        p1.showFullInfo();

        Person p2 = new Person("Ihor", "Markow", 45, "Lviv");
        p2.showShortInfo();

        Person p3 = new Person("Max", "Frai", 55, "Kyiv", 1980, 10,25);
        p3.showFullInfo();

    }
}
