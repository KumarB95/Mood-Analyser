package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    void givenMessage_WhenInAnyMood_ShouldReturnHappy() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenSad_ShouldReturnSad_UsingParameterizedConstructor() {
        moodAnalyser moodAnalyser = new moodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
}
