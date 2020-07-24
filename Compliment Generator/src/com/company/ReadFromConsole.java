package com.company;

import java.util.Scanner;

public class ReadFromConsole implements Readable {
    private double stressScore;
    private double averageHoursWorked;
    private String yesOrNoResponse;

    Scanner scanner = new Scanner(System.in);

    public ReadFromConsole() {
        this.stressScore = stressScore;
        this.averageHoursWorked = averageHoursWorked;
        this.yesOrNoResponse = yesOrNoResponse;
    }

    public void sleepEvaluation() {
        stressScore += (9 - scanner.nextDouble());
    }

    public void hoursWorkedStress() {
         averageHoursWorked = scanner.nextDouble();
        if (averageHoursWorked > 6) {
            stressScore += (averageHoursWorked - 6);
        }
    }

    public void interpretEmotions() {
        yesOrNoResponse = scanner.next();
        if (yesOrNoResponse.equalsIgnoreCase("yes")){
            stressScore+=5;
        }

    }


    public double getStressScore() {
        return stressScore;
    }
}

