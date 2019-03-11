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

        Person person1 = new Person("Ihor", "Petrow", 25, "Lviv");
        Person person2 = new Person();
        person1.showInfo();

        person2.showInfo();
    }
}
