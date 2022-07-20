package JH.codetest.WhatIsInterface;

public interface Examinable extends CalculatableFactorial, PrintOutable {


    void examinePrecondition();

    @Override
    void calculateFactorial();

    @Override
    void printOut();
}
