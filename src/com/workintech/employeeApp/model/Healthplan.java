package com.workintech.employeeApp.model;

import com.workintech.employeeApp.enums.Plan;

public class Healthplan {

    private long id;
    private String name;
    private Plan plan;

    public Healthplan(long id, String name,Plan plan){
        this.id=id;
        this.name=name;
        this.plan=plan;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Plan getPlan(){
        return plan;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPlan(Plan plan){
        this.plan= plan;
    }

    public String toString(){
        return "HealtPlan = " + "id: " +id + "name: " + name + "plan: " + plan;
    }


}
