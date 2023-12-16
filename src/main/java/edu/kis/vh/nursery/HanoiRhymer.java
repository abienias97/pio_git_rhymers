package edu.kis.vh.nursery;

public class HanoiRhymer extends probablySomethingWithFifo {

    int totalRemoved = 0;

    public int reportRejected() {
        return totalRemoved;
    }

    public void putOnTop(int in) {
        if (!checkIfEmpty() && in > showElementFromTop())
            totalRemoved++;
        else
            super.putOnTop(in);
    }
}
