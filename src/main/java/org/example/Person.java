package org.example;

import java.util.Date;

public class Person {
    private final int ID;
    private final String name;
    private final  String gender;
    private final Department department;
    private final double salary;
    private final String birthDate;


    public Person(String name, int id, String gender, String birthDate, double salary, Department department) {
        this.name = name;
        ID = id;
        this.gender = gender;
        this.birthDate = birthDate;
        this.salary = salary;
        this.department = department;
    }

    public int getId(){
        return ID;
    }
    public String name(){
        return name;
    }
    public String gender(){
        return  gender;
    }
    public Department getDepartment(){
        return department;
    }
    public double getSalary(){
        return  salary;
    }
    public String getBirthDate(){
        return  birthDate;
    }


}
