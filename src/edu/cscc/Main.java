package edu.cscc;

public class Main {

    public static void main(String[] args) {
        // Gaige Wycuff, Killoran, CSCI-1660, program to print days where snow is likely, 1/21/2020
        int[] temp = {45, 29, 10, 22, 41, 28, 33};
        double[] perc = {0.95, 0.60, 0.25, 0.5, 0.0, 0.75, 0.90};
        String[] day = {"Sunday" , "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for(int i = 0; i < 7; i++) {
            if (temp[i] <= 32) {
                if (perc[i] > 0.5) {
                    System.out.println(day[i]);
                }
            }
        }
    }
}
