package org.example;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void TestMoodAnalysis() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
}