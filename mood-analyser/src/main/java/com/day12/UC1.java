package com.day12;

public class UC1<T> {

    public String analyseMood(T message) {
        String strMessage = message.toString();
        if (strMessage.contains("sad"))
        {
            return "Sad";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        UC1<String> moodAnalyser = new UC1<>();
        String mood = moodAnalyser.analyseMood(("I am feeling very happy today!").toLowerCase());
        System.out.println("Mood: " + mood);
    }
}