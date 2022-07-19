package JH.codetest.WhatIsInterface;

public interface Exceptionable extends CalculatableFactorial, PrintOutable {


    void exception();

    @Override
    void calculateFactorial();

    @Override
    void printOut();
}
