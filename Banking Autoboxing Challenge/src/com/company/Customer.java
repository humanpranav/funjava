package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;

    private ArrayList<Double> customerTransactions;


    public Customer(String name, double initialAmount){
        this.name= name;
        this.customerTransactions = new ArrayList <Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(Double transaction){
        this.customerTransactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }
}
