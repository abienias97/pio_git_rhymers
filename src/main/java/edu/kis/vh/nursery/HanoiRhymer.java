package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRemoved = 0;

    public int reportRejected() {
        return totalRemoved;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRemoved++;
        else
            super.countIn(in);
    }
}
