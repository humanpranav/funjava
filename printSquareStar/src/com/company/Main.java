package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an Integer greater than 5 and I will give you a present.");
        printSquareStar(scanner.nextInt());
    }
        public static void printSquareStar ( int number){
            if (number < 5) {
                System.out.println("Invalid Value");
            } else {

                for (int x = 1; x <= number; x++) {


                    for (int y = 1; y < number; y++) {
                        if (y == 1 || x == 1 || x == number || y == number) {
                            System.out.print("*");
                        } else if (x == y) {
                            System.out.print("*");
                        } else if (x + y == number + 1) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }

                    System.out.println("*");
                }


            }
        }

}
