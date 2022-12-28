package com.karol;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestData {

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(0L, 0L),
                Arguments.of(1L, 1L),
                Arguments.of(2L, 1L),
                Arguments.of(3L, 2L),
                Arguments.of(4L, 3L),
                Arguments.of(5L, 5L),
                Arguments.of(6L, 8L),
                Arguments.of(7L, 13L),
                Arguments.of(8L, 21L),
                Arguments.of(9L, 34L),
                Arguments.of(10L, 55L),
                Arguments.of(11L, 89L),
                Arguments.of(12L, 144L),
                Arguments.of(13L, 233L),
                Arguments.of(14L, 377L),
                Arguments.of(15L, 610L),
                Arguments.of(16L, 987L),
                Arguments.of(17L, 1597L),
                Arguments.of(18L, 2584L),
                Arguments.of(19L, 4181L),
                Arguments.of(20L, 6765L),
                Arguments.of(21L, 10946L),
                Arguments.of(22L, 17711L),
                Arguments.of(23L, 28657L),
                Arguments.of(24L, 46368L),
                Arguments.of(25L, 75025L),
                Arguments.of(26L, 121393L),
                Arguments.of(27L, 196418L),
                Arguments.of(28L, 317811L),
                Arguments.of(29L, 514229L),
                Arguments.of(30L, 832040L),
                Arguments.of(31L, 1346269L),
                Arguments.of(32L, 2178309L),
                Arguments.of(33L, 3524578L),
                Arguments.of(34L, 5702887L),
                Arguments.of(35L, 9227465L),
                Arguments.of(36L, 14930352L),
                Arguments.of(37L, 24157817L),
                Arguments.of(38L, 39088169L),
                Arguments.of(39L, 63245986L),
                Arguments.of(40L, 102334155L),
                Arguments.of(41L, 165580141L),
                Arguments.of(42L, 267914296L),
                Arguments.of(43L, 433494437L),
                Arguments.of(44L, 701408733L),
                Arguments.of(45L, 1134903170L),
                Arguments.of(46L, 1836311903L),
                Arguments.of(47L, 2971215073L),
                Arguments.of(48L, 4807526976L),
                Arguments.of(49L, 7778742049L),
                Arguments.of(50L, 12586269025L),
                Arguments.of(51L, 20365011074L),
                Arguments.of(52L, 32951280099L)
        );
    }
}
