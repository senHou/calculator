package com.sen.learning.jenkins.calculator.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorServiceTest {

    public CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @ParameterizedTest
    @CsvSource({"1,1,2", "0,0,0", "-1,1,0"})
    public void testSum(int a, int b, int result) {
        int actual = calculatorService.sum(a, b);
        assertEquals(result, actual);
    }

}
