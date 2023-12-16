package edu.kis.vh.nursery;

public class FIFORhymer extends probablySomethingWithFifo {


    public probablySomethingWithFifo fifoRymowacz = new probablySomethingWithFifo();


    @Override
    public int removeFromTop() {
        while (!checkIfEmpty())

            fifoRymowacz.putOnTop(super.removeFromTop());

        int currentSize = fifoRymowacz.removeFromTop();

        while (!fifoRymowacz.checkIfEmpty())

            putOnTop(fifoRymowacz.removeFromTop());


        return currentSize;
    }
}
