package org.example;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void TestMoodAnalysisEnteredEmpty() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void TestMoodAnalysisEnteredNull() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void TestMoodAnalysisAnyMood() throws MoodAnalyserException{
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in Any mood");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void TestMoodAnalysisSadMood() throws MoodAnalyserException{
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void TestMoodAnalysisHappyMood() throws MoodAnalyserException{
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in happy mood");
        Assert.assertEquals("HAPPY", mood);
    }
}