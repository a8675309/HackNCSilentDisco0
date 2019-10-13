package com.example.hackncsilentdisco.ui;

public class Scoreboard {
    public static int fCorrect = 0;
    public static int fAttempts = 0;
    public static int sCorrect = 0;
    public static int sAttempts = 0;

    public static double getFrenchAverage(){
        return fAttempts == 0 ? 0 : ((double) fCorrect) / ((double) fAttempts);
    }

    public static double getSpanishAverage(){
        return sAttempts == 0 ? 0 : ((double) sCorrect) / ((double) sAttempts);
    }
}
