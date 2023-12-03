package com.day12;

public class UC2 {

    private String message;

    public UC2(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("happy") || this.message.contains("Happy") || this.message.contains("HAPPY")) {
                return "Happy";
            } else if (this.message.contains("sad") || this.message.contains("Sad") || this.message.contains("SAD")) {
                return "Sad";
            } else {
                return "Neutral";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        UC2 moodAnalyser = new UC2("I am in Happy Mood");
        System.out.println("Mood: " + moodAnalyser.analyseMood());

        UC2 moodAnalyserNull = new UC2(null);
        System.out.println("Mood: " + moodAnalyserNull.analyseMood());
    }
}