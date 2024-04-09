package com.jrodmanu.fibonacciservice.controller;

import com.jrodmanu.fibonacciservice.dto.FibonacciDto;
import com.jrodmanu.fibonacciservice.service.FibonacciService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("fibonacci-numbers")
public class FibonacciController {

    private final FibonacciService fibonacciService;
    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("/next-highest")
    public FibonacciDto getNextHighestFibonacciNumber(@RequestParam BigInteger currentFibonacciNumber) {
        return new FibonacciDto(fibonacciService.getNextHighestFibonacciNumber(currentFibonacciNumber));
    }

}
