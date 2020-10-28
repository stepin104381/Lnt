package com.example.lnt;

import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    @Test
    public void test_add(){
        int expected=30;
        int actual=calculator.add(10,20);
        assertEquals(expected,actual);
    }

}