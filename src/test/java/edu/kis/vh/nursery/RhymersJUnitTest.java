package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        probablySomethingWithFifo rhymer = new probablySomethingWithFifo();
        int testValue = 4;
        rhymer.putOnTop(testValue);

        int result = rhymer.showElementFromTop();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        probablySomethingWithFifo rhymer = new probablySomethingWithFifo();
        boolean result = rhymer.checkIfEmpty();
        Assert.assertTrue(result);

        rhymer.putOnTop(888);

        result = rhymer.checkIfEmpty();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        probablySomethingWithFifo rhymer = new probablySomethingWithFifo();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.checkIfFull();
            Assert.assertFalse(result);
            rhymer.putOnTop(888);
        }

        boolean result = rhymer.checkIfFull();
        Assert.assertTrue(result);
    }

    @Test
    public void testPeekaboo() {
        probablySomethingWithFifo rhymer = new probablySomethingWithFifo();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.showElementFromTop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.putOnTop(testValue);

        result = rhymer.showElementFromTop();
        Assert.assertEquals(testValue, result);
        result = rhymer.showElementFromTop();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        probablySomethingWithFifo rhymer = new probablySomethingWithFifo();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.removeFromTop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.putOnTop(testValue);

        result = rhymer.removeFromTop();
        Assert.assertEquals(testValue, result);
        result = rhymer.removeFromTop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
