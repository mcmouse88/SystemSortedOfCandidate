package com.company;

import java.util.Comparator;

public class CandidateComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate c1, Candidate c2) {
        int diff = c1.getRelevance() - c2.getRelevance();
        return diff != 0 ? diff : (c1.getRating() - c2.getRating());
    }
}
