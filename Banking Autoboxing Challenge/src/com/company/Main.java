package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank= new Bank("PNC Bank");
        bank.addBranch("Pittsburgh");
        bank.addCustomer("Pittsburgh", "Pranav", 100.0);
        bank.addCustomer("Pittsburgh", "Danny", 200.50);
        bank.addCustomer("Pittsburgh", "Brendan", 500.0);

        bank.addBranch("San Jose");
        bank.addCustomer("San Jose", "Amitoj", 656);
        bank.addCustomerTransaction("Pittsburgh", "Pranav", 3000);
        bank.addCustomerTransaction("Pittsburgh", "Danny", 1000);

        bank.listCustomers("Pittsburgh", true);
        bank.listCustomers("San Jose", true);
    }
}
