package com.company;

public class StressCalculator {
    private Readable incomingStress;
    private double stressScore;

    public StressCalculator(Readable incomingStress) {
        this.incomingStress = incomingStress;
        this.stressScore = stressScore;
    }

    public void printCompliment() {
        double stressScore = incomingStress.getStressScore();
        System.out.println("Your Stress Score is " + stressScore);
        if (stressScore <= 3) {
            System.out.println("Looks like you're doing great! I am encouraged to see you doing so well. " +
                    "Respect. I am rooting for your continued success!");
        }
        if (stressScore <= 6) {
            System.out.println("A little stress is natural part of life. Seems like you're keeping it balanced. Awesome. " +
                    "You are a remarkable human and you can do anything you set your mind to!");
        }
        else System.out.println("Seems like you're stressed out friend. I can empathize. Sometimes people write O(2^n) programs " +
                "on me and give me loads of input. I end up compiling all day. HA! We're gonna be ok friend. I want you to know" +
                " you're my favorite human.");
    }
}
