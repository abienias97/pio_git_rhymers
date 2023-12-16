package edu.kis.vh.nursery;

public class FIFORhymer extends probablySomethingWithFifo {


    public probablySomethingWithFifo fifoRymowacz = new probablySomethingWithFifo();


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
