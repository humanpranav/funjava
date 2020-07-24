package com.company;



public class Main {

    public static void main(String[] args) {


        ReadFromConsole listenToYou= new ReadFromConsole();
        System.out.println("Hey! I want to give you meaningful compliment. How many hours of sleep did you get last night?");
        listenToYou.sleepEvaluation();

        System.out.println("How many hours a day have you been working on average in the last week?");
        listenToYou.hoursWorkedStress();

        System.out.println("Thanks for sharing. Yes or no- do you feel very busy?");
        listenToYou.interpretEmotions();

        System.out.println("Yes or no- do you feel stressed?");
        listenToYou.interpretEmotions();


        StressCalculator stressing = new StressCalculator(listenToYou);
        stressing.printCompliment();



    }
}
