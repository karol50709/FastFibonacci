package com.karol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class SingletonFastFibonacciImplTest {

    @Test
    public void testSingleton(){
        //given
        FastFibonacci fastFibonacci = SingletonFastFibonacciImpl.getInstance();
        SingletonFastFibonacciImpl singletonFastFibonacciImpl = SingletonFastFibonacciImpl.getInstance();

        //then
        Assertions.assertEquals(fastFibonacci, singletonFastFibonacciImpl);
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testValues(Long input, Long expected){
        //given
        FastFibonacci fastFibonacci = SingletonFastFibonacciImpl.getInstance();
        //when
        Long calculate = fastFibonacci.calculate(input);
        // then
        Assertions.assertEquals(expected, calculate);
    }

    private static Stream<Arguments> getTestData() {
        return TestData.getTestData();
    }

}
