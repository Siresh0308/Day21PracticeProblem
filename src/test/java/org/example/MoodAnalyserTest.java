package org.example;



import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void TestMoodAnalysis() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }
}