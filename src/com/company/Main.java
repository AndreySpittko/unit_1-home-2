package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
/*
        Person p1 = new Person();
        p1.showFullInfo();

        Person p2 = new Person("Ihor", "Markow", 45, "Lviv");
        p2.showShortInfo();

        Person p3 = new Person("Max", "Frai", 55, "Kyiv", 1980, 10,25);
        p3.showFullInfo();
*/


        Employee e1 = new Employee("Max1", "Frai1", 55, "Kyiv", 1980, 10,25);
//        Employee e1 = ;
//        Employee e2 = ;
//        Employee e3 = ;
        e1.showFullInfo();
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Max1", "Frai1", 55, "Kyiv", 1980, 10,25));
        employeeList.add(new Employee("Max2", "Frai2", 23, "Kyiv", 1999, 5,12));
        employeeList.add(new Employee("Max3", "Frai3", 15, "Kyiv", 1945, 8,8));
        for(Employee emp : employeeList){
            emp.showFullInfo();
        }

    }
}
