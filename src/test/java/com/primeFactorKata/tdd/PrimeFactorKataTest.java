package com.primeFactorKata.tdd;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PrimeFactorKataTest {

    private PrimeFactorKata primes;

    @Before
    public void setUp() {
        primes = new PrimeFactorKata();
    }

    @Test
    public void testTwoReturnPrimeFactors() {
        List<Integer> numbers = new ArrayList<Integer>() {{
            add(2);
        }};
        assertEquals(numbers, primes.getPrimeFactor(2));
    }

    @Test
    public void testThreePrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(3);
        }};

        assertEquals(number, primes.getPrimeFactor(3));
    }

    @Test
    public void testFourPrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(2);
            add(2);
        }};

        assertEquals(number, primes.getPrimeFactor(4));
    }

    @Test
    public void testFivePrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(5);
        }};

        assertEquals(number, primes.getPrimeFactor(5));
    }

    @Test
    public void testSixPrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(2);
            add(3);
        }};

        assertEquals(number, primes.getPrimeFactor(6));
    }

    @Test
    public void testSevenPrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(7);
        }};

        assertEquals(number, primes.getPrimeFactor(7));
    }

    @Test
    public void testEightPrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(2);
            add(2);
            add(2);
        }};

        assertEquals(number, primes.getPrimeFactor(8));
    }

    @Test
    public void testNinePrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(3);
            add(3);
        }};

        assertEquals(number, primes.getPrimeFactor(9));
    }

    @Test
    public void testTenPrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(2);
            add(5);
        }};

        assertEquals(number, primes.getPrimeFactor(10));
    }

    @Test
    public void testElevenPrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(11);
        }};

        assertEquals(number, primes.getPrimeFactor(11));
    }

    @Test
    public void testTwelvePrimeFactors() {
        List<Integer> number = new ArrayList<Integer>(){{
            add(2);
            add(2);
            add(3);
        }};

        assertEquals(number, primes.getPrimeFactor(12));
    }
}
