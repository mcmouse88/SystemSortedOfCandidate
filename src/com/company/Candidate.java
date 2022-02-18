package com.company;

public class Candidate {

    private final String name;
    private final String male;
    private final String age;
    private int relevance;
    private int rating;

    public Candidate(String name, String male, String age, int relevance, int rating) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s%nпол: %s%nвозраст: %s%nРелевантность резюме: %d%nОценка на собеседовании: %d%n", name, male, age, relevance, rating);
    }


}
