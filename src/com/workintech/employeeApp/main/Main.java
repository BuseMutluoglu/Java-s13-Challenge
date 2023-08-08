package com.workintech.employeeApp.main;

import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1=new Healthplan(4,"X Sigorta", Plan.ADVANCE);
        Healthplan plan2=new Healthplan(4,"Y Sigorta", Plan.NORMAL);

        String[] healthplans=new String[5];
        healthplans[0]=plan1.getName();
        healthplans[1]=plan2.getName();
        Employee developer=new Employee(1,"Buse","buse@gmail.com","sananebe",healthplans);
        //developer.addHealthplan(1,"T Sigorta");
        //developer.addHealthplan(4,"R Sigorta");
        //developer.addHealthplan(6,"Ğ Sigorta");

        System.out.println(developer);

        String[] developerNames = new String[5];
        developerNames[0] = developer.getFullName();
        //System.out.println(Double.MAX_VALUE);
        Employee junior = new Employee(2, "Ahmet Mehmet", "x", "1245", healthplans);
        //developerNames[1] = junior.getFullName();
        Company company = new Company(1, "Workintech", 1200000000000.45, developerNames);
        company.addEmployee(1, junior.getFullName());

        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
