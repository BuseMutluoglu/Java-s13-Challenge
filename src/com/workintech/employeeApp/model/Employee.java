package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public String[] getHealthplans(){
        return healthplans;
    }
    public int getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }

    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public void setHealthplans(){
        this.healthplans=healthplans;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public  void setPassword(String password){
        this.password=password;
    }
    public void addHealthplan(int index, String name) {
        try {
            boolean isExist = false;
            for(String healtplan: healthplans){
                if(healtplan.equals(name)){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                if (healthplans[index] == null) {
                    healthplans[index] = name;
                } else {
                    System.out.println("İlgili index için atama yapılmış");
                }
            } else{
                System.out.println(name + " bu isimde healthplan mevcut");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }

    public String toString(){
        return "id: " + id + " fullName: " + fullName + " email: " + email + " password: " + password +
                " healtplans: " + Arrays.toString(healthplans);
    }
}
