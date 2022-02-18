package com.company;

import java.util.Comparator;

public class CandidateComparatorByAge implements Comparator<Candidate> {

    @Override
    public int compare(Candidate c1, Candidate c2) {
        return c2.getAge().compareTo(c1.getAge());
    }
}
