package com.wgcisotto.ood.concepts.abstraction;

public class AbstractionEmployeeTest {

    public static void main (String ...args){
        Employee contractor = new Contractor("contractor", 80, 7);
        Employee fulltimeEmployee = new FullTimeEmployee("Full Time Employee", 70);

        System.out.println("Contractor Salary: " + contractor.calculateSalary());
        System.out.println("Full time Employee: " + fulltimeEmployee.calculateSalary());
    }

}