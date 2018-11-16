package com.wgcisotto.ood.concepts.abstraction;

public class FullTimeEmployee extends Employee {

    public static final int FULL_TIME_HOURS = 8;

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * FULL_TIME_HOURS;
    }

}