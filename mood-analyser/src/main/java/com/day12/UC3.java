package com.day12;

public class UC3 {
    private String message;

    public enum MoodAnalysisError {
        NULL_MOOD, EMPTY_MOOD
    }

    public static class MoodAnalysisException extends Exception {
        private MoodAnalysisError errorType;

        public MoodAnalysisException(MoodAnalysisError errorType, String message) {
            super(message);
            this.errorType = errorType;
        }

        public MoodAnalysisError getErrorType() {
            return errorType;
        }
    }

    public UC3(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (this.message == null) {
                throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD, "Mood is null");
            }
            if (this.message.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD, "Mood is empty");
            }

            if (this.message.contains("happy") || this.message.contains("Happy") || this.message.contains("HAPPY")) {
                return "Happy";
            } else if (this.message.contains("sad") || this.message.contains("Sad") || this.message.contains("SAD")) {
                return "Sad";
            } else {
                return "Neutral";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD, "Mood is null");
        }
    }

    public static void main(String[] args) {
        try {
            UC3 moodAnalyser = new UC3(null);
            System.out.println("Mood: " + moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage() + " [" + e.getErrorType() + "]");
        }
    }
}