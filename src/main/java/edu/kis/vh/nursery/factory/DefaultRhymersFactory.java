package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.probablySomethingWithFifo;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public probablySomethingWithFifo GetStandardRhymer() {
        return new probablySomethingWithFifo();
    }

    @Override
    public probablySomethingWithFifo GetFalseRhymer() {
        return new probablySomethingWithFifo();
    }

    @Override
    public probablySomethingWithFifo GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public probablySomethingWithFifo GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
