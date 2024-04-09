package com.jrodmanu.fibonacciservice.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FibonacciService {

    public BigInteger getNextHighestFibonacciNumber(BigInteger currentFibonacciNumber) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c;
        while (a.compareTo(currentFibonacciNumber) < 1) {
            c = a;
            a = a.add(b);
            b = c;
        }
        return a;
    }

}
