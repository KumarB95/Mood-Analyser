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
}
