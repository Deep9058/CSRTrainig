package com.packages;

public class Exercise27 {

    public static String moodAnalyzer(String mood) {

        switch (mood.toUpperCase()) {
            case "HAPPY":
                return "😀";
            case "SAD":
                return "😞";
            case "TIRED":
                return "🥱";
            case "EXCITED":
                return "😱";
            default:
                return "🤔";
        }
    }

    public static void main(String[] args) {
        System.out.println(moodAnalyzer("sAd"));
    }
}