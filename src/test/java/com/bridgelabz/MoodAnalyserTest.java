package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Sad Mood");
        } catch (moodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenInAnyMood_ShouldReturnHappy() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Any Mood");
        } catch (moodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Happy Mood");
        } catch (moodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenSad_ShouldReturnSad_UsingParameterizedConstructor() {
        moodAnalyser moodAnalyser = new moodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (moodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy_UsingParameterizedConstructor() {
        moodAnalyser moodAnalyser = new moodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (moodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenNullMood_ShouldThrow_MoodAnalysisException() {
        moodAnalyser moodAnalyser = new moodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (moodAnalysisException e) {
            Assertions.assertEquals(moodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    void givenEmptyMood_ShouldThrow_MoodAnalysisException() {
        moodAnalyser moodAnalyser = new moodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        } catch (moodAnalysisException e) {
            Assertions.assertEquals(moodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
