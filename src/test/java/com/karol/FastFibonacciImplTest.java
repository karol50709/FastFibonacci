package com.karol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class FastFibonacciImplTest {

    @Test
    public void testIsNotSingleton() {
        //given
        FastFibonacci fastFibonacci = FastFibonacciImpl.getInstance();
        FastFibonacci fastFibonacci2 = FastFibonacciImpl.getInstance();

        //then
        Assertions.assertNotEquals(fastFibonacci, fastFibonacci2);
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testValues(Long input, Long expected) {
        //given
        FastFibonacci fastFibonacci = FastFibonacciImpl.getInstance();
        //when
        Long calculate = fastFibonacci.calculate(input);
        // then
        Assertions.assertEquals(expected, calculate);
    }

    private static Stream<Arguments> getTestData() {
        return TestData.getTestData();
    }
}
