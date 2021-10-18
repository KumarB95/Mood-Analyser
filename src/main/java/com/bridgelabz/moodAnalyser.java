package com.bridgelabz;
/*
* Mood analyser program
* Author : Navalkumar
* Date : 18/10/21
* */
public class moodAnalyser {
    private String message;
    // default constructor
    public moodAnalyser(){
    }
    // parameterized constructor
    public moodAnalyser(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser Program");
    }
    //This method is created for implementing test cases which does not use parameterized constructor
    public String analyseMood(String message) throws moodAnalysisException{
        this.message = message;
        return analyseMood();
    }
    //This method is created for implementing test cases which uses parameterized constructor
    public String analyseMood()throws moodAnalysisException {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException exception){
            throw new moodAnalysisException(moodAnalysisException.ExceptionType.ENTERED_NULL, "Please enter proper message");
        }
    }
}
