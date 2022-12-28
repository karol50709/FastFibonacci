package com.karol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
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

    @Test
    public void functionalInterfaceProofTest(){
        //given
        FastFibonacci fastFibonacci = SingletonFastFibonacciImpl.getInstance();

        //when
        List<Long> collect = Stream.of(1L, 2L, 3L, 4L, 5L)
                .map(fastFibonacci::calculate)
                .collect(Collectors.toList());

        //then
        Assertions.assertEquals(List.of(1L,1L,2L,3L,5L), collect);
    }

    private static Stream<Arguments> getTestData() {
        return TestData.getTestData();
    }

}
