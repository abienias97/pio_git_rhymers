package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer fifoRymowacz = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            fifoRymowacz.countIn(super.countOut());

        int currentSize = fifoRymowacz.countOut();

        while (!fifoRymowacz.callCheck())

            countIn(fifoRymowacz.countOut());

        return currentSize;
    }
}
