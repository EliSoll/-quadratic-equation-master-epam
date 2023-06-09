package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private String expected;
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 5, 4, "-1.0 -4.0"},
                {2, 6, 1.375, "-0.25 -2.75"},
                {1.625, 7, 2, "-0.3076923076923077 -4.0"},
                {4, 8, 1.75, "-0.25 -1.75"},
        });
    }
    @Test
    public void testTwoRootsCase() {
        try {
            assertEquals(expected, quadraticEquation.solve(a, b, c));
        } catch (AssertionError e) {
            changeExpected();
            assertEquals(expected, quadraticEquation.solve(a, b, c));
        }
    }

    public void changeExpected() {
        if (a == 1.0) {
            expected = "-4.0 -1.0";
        } else if (a == 2.0) {
            expected = "-2.75 -0.25";
        } else if (a == 1.625) {
            expected = "-4.0 -0.3076923076923077";
        } else {
            expected = "-1.75 -0.25";
        }
    }
}