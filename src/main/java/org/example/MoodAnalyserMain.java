package org.example;

public class MoodAnalyserMain {
    private String message;

    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Happy"))
            return "SAD";
        else
            return "HAPPY";
    }
}