package com.bridgelabz;
/*
* Mood analyser program
* Author : Navalkumar
* Date : 18/10/21
* */
public class moodAnalyser {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser Program");
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
