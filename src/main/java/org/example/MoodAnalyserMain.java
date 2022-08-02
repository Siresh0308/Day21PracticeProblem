package org.example;
public class MoodAnalyserMain {
    private String message;

    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyserException{
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyserException{
        try {
            if(message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please Enter Some Message");

            if (message.contains("Happy"))
                return "SAD";
            else
                return "HAPPY";
        }catch(NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Enter a Proper Message");
        }
    }
}