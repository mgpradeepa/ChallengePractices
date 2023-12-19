package com.mgp.pjava8p.funcint;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class LambdaBiFunctionForMath {

    // Create constants representing the four available math functions
    public static final String ADD = "ADD";
    public static final String SUBTRACT = "SUBTRACT";
    public static final String MULTIPLY = "MULTIPLY";
    public static final String DIVIDE = "DIVIDE";

    // Do mathematical calculations using lambda expressions
    public static Map<String, Float> calculate(float value1, float value2) {

        // Your code goes here
        // Create 4 instances of the BiFunction interface referencing lambda expressions
        BiFunction<Float, Float, Float> add = (a, b)-> a+b;
        BiFunction<Float, Float, Float> Add = Float::sum;
        BiFunction<Float, Float, Float> subtract = (a,b)-> a-b;
        BiFunction<Float, Float, Float>  multiply = (a,b)-> a*b;
        BiFunction<Float, Float, Float> divide = (a,b)-> a/b;

        // Map object for holding the results
        Map<String, Float> results = new HashMap<>();
        results.put(ADD, add.apply(value1,value2));
        results.put(SUBTRACT, subtract.apply(value1,value2));
        results.put(MULTIPLY, multiply.apply(value1,value2));
        results.put(DIVIDE, divide.apply(value1,value2));
        results.put("ADDL", Add.apply(value1, value2));

        // Populate the map here with the results of the 4 math operations

        return results;
    }
    public static void main(String[] args) {
        float value1 = 10f;
        float value2 = 20f;
        Map<String, Float> results = LambdaBiFunctionForMath.calculate(value1, value2);
        System.out.println(results);
    }
}
