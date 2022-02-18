package com.company;

import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static final Random RAND = new Random();

    public static void main(String[] args) {
        NavigableSet<Candidate> candidatesList = new TreeSet<>(new CandidateComparator().thenComparing(new CandidateComparatorByAge()));
        fill(candidatesList);

        for (Candidate candidate : candidatesList.descendingSet()) {
            System.out.println(candidate);
        }

    }

    public static void addNewCandidate(Set<Candidate> candidatesList, String name, String male, String age) {
        int relevance = RAND.nextInt(6);
        int rating = RAND.nextInt(6);
        candidatesList.add(new Candidate(name, male, age, relevance, rating));
    }

    public static void fill(Set<Candidate> candidatesList) {
        addNewCandidate(candidatesList, "Чайковский Петр Ильич", "мужской", "46");
        addNewCandidate(candidatesList, "Иоганн Себастьян Бах", "мужской", "38");
        addNewCandidate(candidatesList, "Маргарет Хильда Тэтчер", "женский", "41");
        addNewCandidate(candidatesList, "Вольфганг Амадей Моцарт", "мужской", "26");
        addNewCandidate(candidatesList, "Людвиг Ван Бетховен", "мужской", "27");
        addNewCandidate(candidatesList, "Мария Склодовская Кюри", "женский", "25");
        addNewCandidate(candidatesList, "Асатиани Тина Левановна", "женский", "31");
        addNewCandidate(candidatesList, "Плисецкая Майя Михайловна", "женский", "22");
        addNewCandidate(candidatesList, "Франц Петер Шуберт", "мужской", "18");
        addNewCandidate(candidatesList, "Чарльз Роберт Дарвин", "мужской", "24");
        addNewCandidate(candidatesList, "Жан Батист Ламарк", "мужской", "51");
    }
}
