package com.karol;

import java.util.HashMap;

public class FastFibonacciImpl implements FastFibonacci{

    private final HashMap<Long, Long> values;

    public FastFibonacciImpl() {
        this.values = new HashMap<>();
    }

    public static FastFibonacciImpl getInstance(){
        return new FastFibonacciImpl();
    }

    public Long calculate(Long input) {
        if(input >1L){
            Long value = values.get(input);
            if(value == null){
                value = calculate(input-1) + calculate(input -2);
                values.put(input, value);
            }
            return value;
        } else if (input == 1L){
            return 1L;
        }
        else {
            return 0L;
        }
    }
}
