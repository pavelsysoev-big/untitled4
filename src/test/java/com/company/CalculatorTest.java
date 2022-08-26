package com.company;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(1,2),3);
    }
}