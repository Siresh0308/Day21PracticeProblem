package org.example;

public class MoodAnalyserMain {
    private String message;

    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("Happy"))
                return "HAPPY";
            else
                return "SAD";
        }catch(NullPointerException e) {
            return "NULL";
        }
    }
}