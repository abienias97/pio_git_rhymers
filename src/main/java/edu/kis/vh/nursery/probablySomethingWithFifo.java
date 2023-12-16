package edu.kis.vh.nursery;

public class probablySomethingWithFifo {
    //przełącza karty projektu
    private final int[] NUMBERS = new int[12];
    public int total = -1;

    public void putOnTop(int in) {
        if (!checkIfFull())
            NUMBERS[++total] = in;
    }

    public boolean checkIfEmpty() {
        return total == -1;
    }

    public boolean checkIfFull() {
        return total == 11;
    }

    protected int showElementFromTop() {
        if (checkIfEmpty())
            return -1;
        return NUMBERS[total];
    }

    public int removeFromTop() {
        if (checkIfEmpty())
            return -1;
        return NUMBERS[total--];
    }

}
