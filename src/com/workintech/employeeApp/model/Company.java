package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    private double checkGiro(double giro){
        if(giro<0){
            return this.giro=0;
        } else {
            return this.giro=giro;
        }
    }

    public void addEmployee(int index, String name){
        try {
            if(developerNames[index]==null){
                developerNames[index]=name;
            } else {
                System.out.println("İlgili indexte developer mevcut");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Mevcut olmayan indexe atama yapmaya çalıştınız." + index);
        }
    }

    public String toString(){
        return "name: " + name + "id: " + id + "giro: " + giro + "developerNames: " + Arrays.toString(developerNames);
    }

}
