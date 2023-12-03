package com.day12;

public class Refactor {

    private String message;

    public Refactor() {
        this.message = "default happy";
    }

    public Refactor(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (this.message.contains("sad"))
        {
            return "Sad";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        Refactor moodAnalyser = new Refactor("I am feeling very happy today!");
        String mood = moodAnalyser.analyseMood();
        System.out.println("The mood is: " + mood);

        Refactor defaultMoodAnalyser = new Refactor();
        String defaultMood = defaultMoodAnalyser.analyseMood();
        System.out.println("The default mood is: " + defaultMood);
    }
}