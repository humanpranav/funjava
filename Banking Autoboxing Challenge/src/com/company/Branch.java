package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> branchCustomers;


    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers= new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName)==null){
            this.branchCustomers.add(new Customer(customerName,initialAmount));
            return true;
        } return false;

    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer==null){
            this.branchCustomers.add(new Customer(customerName, amount));
            return true;
        } else return false;
    }
    private Customer findCustomer(String customerName){
        for(int i=0; i<this.branchCustomers.size();i++){
            Customer checkedCustomer= this.branchCustomers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        } return null;
    }



}