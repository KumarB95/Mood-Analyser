package com.bridgelabz;

class moodAnalysisException extends Exception{
    ExceptionType type;

    // to inform user whether the mood is null
    enum ExceptionType {
        ENTERED_NULL
    }

    public moodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
